package section07;

public class Practice0703 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};

        int sum = 0;

        for(int num : numbers){
            sum += num;
            System.out.print(num+"\t");
        }

        double average = (double) sum / numbers.length;

        System.out.print("배열 요소 평균 : "+ average);
    }
}
