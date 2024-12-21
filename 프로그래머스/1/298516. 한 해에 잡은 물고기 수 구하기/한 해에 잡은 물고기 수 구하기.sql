SELECT count(*) fish_count FROM fish_info
-- WHERE time like '2021%'
-- WHERE SUBSTR(time, 1, 4) = '2021' -- 첫 번째 숫자부터 4번째 숫자를 자르는 함수 SUBSTR()
WHERE DATE_FORMAT(time, '%Y') = "2021"
