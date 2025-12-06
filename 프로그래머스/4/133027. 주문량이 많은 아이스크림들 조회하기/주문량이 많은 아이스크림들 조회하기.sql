SELECT 
    ut.FLAVOR
FROM
    (
        SELECT
            FLAVOR
            , TOTAL_ORDER
        FROM
            FIRST_HALF
        UNION ALL
        SELECT 
            FLAVOR
            , TOTAL_ORDER
        FROM
            JULY
    ) ut
GROUP BY ut.FLAVOR
ORDER BY SUM(ut.TOTAL_ORDER) DESC
LIMIT 3