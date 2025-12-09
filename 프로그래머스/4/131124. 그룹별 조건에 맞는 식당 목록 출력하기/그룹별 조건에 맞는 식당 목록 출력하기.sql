SELECT
    mp.MEMBER_NAME
    , rr.REVIEW_TEXT
    , DATE_FORMAT(rr.REVIEW_DATE, '%Y-%m-%d') REVIEW_DATE
FROM
    REST_REVIEW rr
JOIN
    (
        SELECT 
            mp.MEMBER_NAME
            , mp.MEMBER_ID
        FROM
            MEMBER_PROFILE mp
        JOIN 
            (
                SELECT
                    MEMBER_ID
                    , COUNT(*) COUNT
                FROM
                    REST_REVIEW
                GROUP BY
                    MEMBER_ID
                ORDER BY COUNT DESC
                LIMIT 1
            ) rr
        ON
            mp.MEMBER_ID = rr.MEMBER_ID
    ) mp
ON
    rr.MEMBER_ID = mp.MEMBER_ID
ORDER BY 3, 2