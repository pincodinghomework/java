package section06;

import java.util.Scanner;

public class Practice0605 {
    public static void main(String[] args) {
        /* 
         * 문자열을 입력하세요 : java
         * 문자열 뒤집기 : avaj
        */

        String input;
        String revesed = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 :");

        input = scanner.nextLine();
        revesed = input;

        for(int i = input.length() - 1; i >= 0; i--){
            System.out.printf("%s", revesed.charAt(i));
        }
        scanner.close();

    }
}
