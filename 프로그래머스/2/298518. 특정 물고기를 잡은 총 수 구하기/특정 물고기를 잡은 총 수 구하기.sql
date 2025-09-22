SELECT COUNT(*) AS FISH_COUNT 
FROM FISH_INFO fi 
JOIN FISH_NAME_INFO fn
ON fi.fish_type = fn.fish_type
WHERE fn.fish_name IN ('BASS', 'SNAPPER')