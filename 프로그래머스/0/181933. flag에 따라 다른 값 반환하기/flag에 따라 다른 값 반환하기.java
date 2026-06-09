class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        //boolean = (flag==true) ? "a+b" : "a-b";
        if(flag==true) {
           return a+b;
        }else
           return a-b;
    }
}