import java.util.Arrays;
    class Solution {
        public int solution(String before, String after) {
          char[] a = before.toCharArray();
          char[] b = after.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a, b)) {
                return 1;
            }
            return 0;
        }
    }
//  int[] count = new int[130]; 

//         for (int i = 0; i < before.length(); i++) {
//             count[before.charAt(i)]++;
//             count[after.charAt(i)]--;
//         }

//         for (int i = 0; i < 128; i++) {
//             if (count[i] != 0) {
//                 return 0;
//             }
//         }

//         return 1;