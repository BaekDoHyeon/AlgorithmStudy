SELECT
    COUNT(fi.FISH_TYPE) FISH_COUNT
    , MAX(fi.LENGTH) MAX_LENGTH
    , fi.FISH_TYPE
FROM 
    FISH_INFO fi
JOIN (
    SELECT 
        FISH_TYPE
        , AVG(LENGTH) AVG_LENGTH
    FROM 
        (SELECT 
            ID
            , FISH_TYPE
            , CASE 
                WHEN LENGTH <= 10 OR LENGTH IS NULL THEN '10'
                ELSE LENGTH
            END AS LENGTH
        FROM 
            FISH_INFO) fi
    GROUP BY
        fi.FISH_TYPE
    HAVING 
        AVG(LENGTH) >= 33) sfi
ON 
    fi.FISH_TYPE = sfi.FISH_TYPE
GROUP BY
    fi.FISH_TYPE
ORDER BY fi.FISH_TYPE