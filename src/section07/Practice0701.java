package section07;

import java.util.Arrays;

public class Practice0701 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};

        for(int num : numbers){
            System.out.print(num+"\t");
        }

        for(int i = 0; i < numbers.length - 4; i++){
            System.out.println(Arrays.toString(numbers));
        }
    }
}
