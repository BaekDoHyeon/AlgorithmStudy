SELECT 
    uu.USER_ID
    , uu.NICKNAME
    , CONCAT(uu.CITY, " ", uu.STREET_ADDRESS1, " ", uu.STREET_ADDRESS2) '전체주소'
    , CONCAT(SUBSTR(uu.TLNO, 1, 3), '-', SUBSTR(uu.TLNO, 4, 4), '-', SUBSTR(uu.TLNO, 8, 4)) '전화번호'
FROM 
    USED_GOODS_USER uu
JOIN 
    (SELECT
        WRITER_ID
    FROM
        USED_GOODS_BOARD 
    GROUP BY
        WRITER_ID
    HAVING 
        COUNT(*) >= 3) ub
ON
   uu.USER_ID = ub.WRITER_ID
ORDER BY uu.USER_ID DESC