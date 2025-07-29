SELECT fh.flavor FLAVOR FROM FIRST_HALF fh 
JOIN ICECREAM_INFO i ON fh.flavor = i.flavor
WHERE fh.total_order > 3000 AND i.ingredient_type = 'fruit_based';