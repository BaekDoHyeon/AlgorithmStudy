select A.REST_ID, 
       A.REST_NAME, A.FOOD_TYPE, A.FAVORITES, A.ADDRESS,
       round(avg(B.REVIEW_SCORE), 2) as SCORE
from REST_INFO A 
     join REST_REVIEW B
       on A.REST_ID = B.REST_ID
where A.ADDRESS like '서울%'
group by A.REST_ID, A.REST_NAME, A.FOOD_TYPE, A.ADDRESS, A.FAVORITES
order by SCORE desc, A.FAVORITES desc