SELECT
    fp.PRODUCT_ID
    , fp.PRODUCT_NAME
    , fp.PRICE * fo.TOTAL_AMOUNT AS TOTAL_SALES
FROM
    FOOD_PRODUCT fp
JOIN 
    (
        SELECT
            PRODUCT_ID
            , SUM(AMOUNT) TOTAL_AMOUNT
        FROM 
            FOOD_ORDER 
        WHERE
            PRODUCE_DATE LIKE '2022-05%'
        GROUP BY 
            PRODUCT_ID
    ) fo
ON
    fp.PRODUCT_ID = fo.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, fp.PRODUCT_ID