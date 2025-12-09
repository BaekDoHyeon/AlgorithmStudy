SELECT 
    os.YEAR
    , os.MONTH
    , ui.GENDER
    , COUNT(*) USERS
FROM
    USER_INFO ui
JOIN
    (
        SELECT 
            YEAR(SALES_DATE) YEAR
            , MONTH(SALES_DATE) MONTH
            , USER_ID
        FROM
            ONLINE_SALE
        GROUP BY
            YEAR(SALES_DATE), MONTH(SALES_DATE), USER_ID
    ) os
ON 
    ui.USER_ID = os.USER_ID
WHERE 
    ui.GENDER IS NOT NULL
GROUP BY
    os.YEAR, os.MONTH, ui.GENDER
ORDER BY 
    1, 2, 3