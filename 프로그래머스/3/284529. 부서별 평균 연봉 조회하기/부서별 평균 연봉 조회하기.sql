SELECT 
    hd.DEPT_ID
    , hd.DEPT_NAME_EN
    , she.AVG_SAL
FROM
    HR_DEPARTMENT hd
JOIN
    (
    SELECT 
        DEPT_ID
        , ROUND(AVG(SAL)) AVG_SAL
    FROM 
        HR_EMPLOYEES
    GROUP BY 
        DEPT_ID
    ) she
ON 
    hd.DEPT_ID = she.DEPT_ID
ORDER BY 3 DESC