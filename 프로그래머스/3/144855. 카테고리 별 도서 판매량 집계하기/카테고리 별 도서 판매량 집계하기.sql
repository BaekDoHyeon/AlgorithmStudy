SELECT 
    b.CATEGORY
    , SUM(bs.SALES) TOTAL_SALES
FROM
    BOOK b
JOIN
    (
        SELECT
            BOOK_ID
            , DATE_FORMAT(SALES_DATE, '%Y-%m-%d') DATE
            , SALES
        FROM
            BOOK_SALES
        WHERE
            YEAR(SALES_DATE) = '2022' AND MONTH(SALES_DATE) = '01'
    ) bs
ON 
    b.BOOK_ID = bs.BOOK_ID
GROUP BY
    b.CATEGORY
ORDER BY b.CATEGORY