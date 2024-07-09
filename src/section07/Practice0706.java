package section07;

import java.util.Arrays;

public class Practice0706 {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        int[][] num = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j]+"");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] nums : num){
            for(int number : nums){
                System.out.print(number + "");
            }
            System.out.println();
        }



    }
}
