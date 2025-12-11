SELECT 
    b.AUTHOR_ID
    , a.AUTHOR_NAME
    , b.CATEGORY
    , SUM(b.PRICE * bs.SUM_SALES) TOTAL_SALES
FROM
    BOOK b
JOIN
    AUTHOR a
ON
    b.AUTHOR_ID = a.AUTHOR_ID
JOIN
    (
        SELECT 
            BOOK_ID
            , SUM(SALES) SUM_SALES
        FROM 
            BOOK_SALES
        WHERE
            DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-01'
        GROUP BY
            BOOK_ID 
    ) bs
ON 
    b.BOOK_ID = bs.BOOK_ID
GROUP BY
    b.AUTHOR_ID, b.CATEGORY
ORDER BY 1, 3 DESC