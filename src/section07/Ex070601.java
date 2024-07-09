package section07;

import java.util.Arrays;

public class Ex070601 {
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5 };

        int[] copiedArray = new int[3];

        System.arraycopy(originalArray, 1, copiedArray, 0, 3);

        // srcPos : 시작하는 index  : 1
        // destpos : 오리지널  index 복사

        // int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        // Arrays.copyOf 깊은 복사하는 방법
        // copiedArray[0] = 100;

        System.out.println("originalArray\t" + Arrays.toString(originalArray));
        System.out.println("copiedArray\t" + Arrays.toString(copiedArray));
    }
}
