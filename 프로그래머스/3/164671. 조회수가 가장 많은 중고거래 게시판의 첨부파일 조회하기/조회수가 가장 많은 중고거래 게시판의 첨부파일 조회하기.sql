SELECT
    CONCAT('/home/grep/src/', uf.BOARD_ID, '/', uf.FILE_ID, uf.FILE_NAME, uf.FILE_EXT) FILE_PATH
FROM
    USED_GOODS_FILE uf
JOIN
    (SELECT 
        BOARD_ID
    FROM 
        USED_GOODS_BOARD ugb
     JOIN
        (SELECT MAX(VIEWS) MAX_VIEW FROM USED_GOODS_BOARD) ugb2
     ON 
        ugb.VIEWS = ugb2.MAX_VIEW
    ) ub
ON
    uf.BOARD_ID = ub.BOARD_ID
ORDER BY uf.FILE_ID DESC