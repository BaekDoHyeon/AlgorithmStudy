class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        
        int i = 0;
        while(i < answer.length) {
            int j = i + n - 1;
            
            answer[i] = num_list[j];
            i++;
        }
        
        return answer;
    }
}