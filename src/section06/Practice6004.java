package section06;

import java.util.Scanner;

public class Practice6004 {
  public static void main(String[] args) {
    /*
     * 
     * 5 x 1 = 5
     * 5 x 2 = 10
     */

    Scanner scanner = new Scanner(System.in);
    System.out.print("출력할 구구단의 단을 입력하세요.");
    int dan = scanner.nextInt();

    for(int i = 1; i <= 9; i++){
      System.out.printf("%d x %d = %d\n", dan, i, dan*i);
    }
  }
}
