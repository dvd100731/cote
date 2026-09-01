class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int answer2 = 0;
        for(int num : numbers){
            if(num > answer){
                answer2 = answer;
                answer = num;
            }else if(num > answer2){
                answer2 = num;
            }
        }
        return answer * answer2;
    }
}