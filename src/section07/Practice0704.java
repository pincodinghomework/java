package section07;

public class Practice0704 {
    public static void main(String[] args) {
        /*
         * 배열의 최댓값 : 50
         * 배열의 최소값 : 10
         */

        int[] numbers = {10,20,30,40,50};

        int max = numbers[0];
        int min = numbers[0];

        // for each

        for(int num : numbers){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        System.out.println("배열의 최댓값" + max);
        System.out.println("배열의 최댓값" + min);

    }
}
