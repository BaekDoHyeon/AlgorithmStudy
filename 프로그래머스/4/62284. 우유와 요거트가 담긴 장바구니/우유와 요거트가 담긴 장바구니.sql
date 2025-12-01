SELECT
    cp.CART_ID
FROM
    CART_PRODUCTS cp
JOIN
    (
        SELECT 
            CART_ID
        FROM
            CART_PRODUCTS
        WHERE 
            NAME = 'Milk'
    ) cp2
ON
    cp.CART_ID = cp2.CART_ID
WHERE 
    cp.NAME = 'Yogurt'
GROUP BY 
    cp.CART_ID
ORDER BY CART_ID