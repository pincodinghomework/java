package section07;

import java.util.Arrays;

public class Ex0707 {
    public static void main(String[] args) {
        // 4차원 배열
        int[][] arrs = new int[3][4];

        
        // arrs[0][1] = 2;
        // arrs[2][0] = 30;
        
        // arrs[0] = new int[] {0,1};
        // arrs[1] = new int[] {2,3,4};
        // arrs[2] = new int[] {5,6,7,8};

       
   
        int index = 0;

        for(int[] arr : arrs){
            System.out.println("index"+index+":"+Arrays.toString(arr));
            index++;
        }
    }
}
