class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String result1= "" + a + b;
        int result2= 2 * a * b;

        if (Integer.parseInt(result1) >= result2){
            answer = Integer.parseInt(result1);
        } else {
            answer = result2;
        }

        return answer;
    }
}