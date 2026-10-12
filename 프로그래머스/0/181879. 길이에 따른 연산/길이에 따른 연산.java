class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length>=11){
            int sum = 0;
            for(int num:num_list){
                sum+=num;
            }
            return sum;
        }
        else{
            int multiply = 1;
            for(int num:num_list){
                multiply*=num;
            }
        return multiply;
        }
    }
}