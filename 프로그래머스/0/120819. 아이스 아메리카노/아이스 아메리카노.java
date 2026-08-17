class Solution {
    public int[] solution(int money) {
       return new int[] {money / 5500, money % 5500};
//         int cups = 0;
//         while(money>=5500){
//             money -= 5500;
//             cups++;
//         }
//         return new int[] {cups, money};
     }
}