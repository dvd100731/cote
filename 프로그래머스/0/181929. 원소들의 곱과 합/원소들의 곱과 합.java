class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int answer = 1;
        for(int num : num_list){
            sum+= num;
            answer *=num;
        }
        int sum2 = sum*sum;
        return answer<sum2? 1:0;
    }
}