SELECT 
    a.APNT_NO
    , p.PT_NAME
    , p.PT_NO
    , d.MCDP_CD
    , d.DR_NAME
    , a.APNT_YMD
FROM 
    DOCTOR d
JOIN
    (
        SELECT 
            APNT_YMD
            , APNT_NO
            , MDDR_ID
            , PT_NO
        FROM 
            APPOINTMENT
        WHERE 
            DATE_FORMAT(APNT_YMD, '%Y-%m-%d') = '2022-04-13' AND APNT_CNCL_YN = 'N'
    ) a
ON
    d.DR_ID = a.MDDR_ID
JOIN
    PATIENT p
ON
    p.PT_NO = a.PT_NO
ORDER BY 6