SELECT 
    ed.ID
    , IFNULL(sed.COUNT, 0) CHILD_COUNT
FROM
    ECOLI_DATA ed
LEFT JOIN
    (
    SELECT
        PARENT_ID
        , COUNT(*) COUNT
    FROM 
        ECOLI_DATA
    GROUP BY
        PARENT_ID
    HAVING 
        PARENT_ID IS NOT NULL
    ) sed
ON
    ed.ID = sed.PARENT_ID
ORDER BY ed.ID