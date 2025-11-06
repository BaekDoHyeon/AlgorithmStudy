SELECT 
    uu.USER_ID
    , uu.NICKNAME
    , ub.TOTAL_SALES
FROM 
    USED_GOODS_USER uu
JOIN
    (
        SELECT
            WRITER_ID
            , SUM(PRICE) TOTAL_SALES
        FROM 
            USED_GOODS_BOARD
        WHERE 
            STATUS = 'DONE'
        GROUP BY
            WRITER_ID
        HAVING 
            TOTAL_SALES >= 700000
    ) ub
ON 
    uu.USER_ID = ub.WRITER_ID
ORDER BY 3