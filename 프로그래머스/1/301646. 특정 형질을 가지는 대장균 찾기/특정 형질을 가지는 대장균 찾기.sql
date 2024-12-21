-- & 연산자는 두 숫자의 각 비트를 비교하여 둘 다 1인 경우에만 1을 반환합니다.
SELECT count(*) COUNT FROM ecoli_data
WHERE (genotype & 2) != 2 AND ((genotype & 4) = 4 OR (genotype & 1) = 1)