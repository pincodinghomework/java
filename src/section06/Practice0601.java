package section06;

import java.util.Scanner;

public class Practice0601 {
  public static void main(String[] args) {

    
    int number;
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("시스템을 종료합니다.");
    number = scanner.nextInt();
    
    // while 문을 이용하여 보기와 같은 결과로 작동하도록 코드를 완성하시오.
    
    while (number != 0) {
      sum += number;
      System.out.print("시스템을 종료합니다.");
      number = scanner.nextInt();
    }

    System.out.print("입력된 숫자들의 합 :" + sum);
    scanner.close();
  }
}
