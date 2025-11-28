SELECT 
    ins.ANIMAL_ID
    , ins.ANIMAL_TYPE
    , ins.NAME
FROM
    (
        SELECT 
            ANIMAL_ID
            , ANIMAL_TYPE
            , NAME
        FROM
            ANIMAL_INS
        WHERE
            SEX_UPON_INTAKE LIKE "Intact%"
    ) ins
JOIN 
    (
        SELECT 
            ANIMAL_ID
            , ANIMAL_TYPE
            , NAME
        FROM
            ANIMAL_OUTS
        WHERE
            SEX_UPON_OUTCOME LIKE "Spayed%" OR SEX_UPON_OUTCOME LIKE "Neutered%"
    ) outs
ON
    ins.ANIMAL_ID = outs.ANIMAL_ID
ORDER BY ins.ANIMAL_ID