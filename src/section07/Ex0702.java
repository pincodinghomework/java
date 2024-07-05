package section07;

import java.util.Arrays;

public class Ex0702 {
  public static void main(String[] args) {
    // int[] oddArrObject;
    // oddArrObject = {1, 3, 5, 7, 9};
    //선언과 초기화는 따로 못함
    // 그래도 할려고하면 new 써야함
    int[] oddArrObject;
    oddArrObject = new int[] {1, 3, 5, 7, 9};

    System.out.println(Arrays.toString(oddArrObject));

    
    int[] intArr = new int[5];
    System.out.println("before -Arrays.toString(intArr)\t" + Arrays.toString(intArr));

    // 넣는 법
    intArr[0] = 1;
    intArr[1] = 1;
    intArr[2] = 1;
    intArr[3] = 1;
    intArr[4] = 1;

    System.out.println("after -Arrays.toString(intArr)\t" + Arrays.toString(intArr));

    // String[] strArr = new String[5];
    // System.out.println(Arrays.toString(strArr));
    
  }
}
