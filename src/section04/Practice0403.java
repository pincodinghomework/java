package section04;

import java.util.Scanner;

public class Practice0403 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("자신의 학점 점수를 적어주세요.");

    int score = scanner.nextInt();

    if (score >= 90) {
      System.out.println("90점 이상 A학점");
    } else if (score >= 80) {
      System.out.println("80점 이상 B학점");
    } else if (score >= 70) {
      System.out.println("70점 이상 C학점");
    } else if (score >= 60) {
      System.out.println("60점 이상 D학점");
    } else if (score < 60) {
      System.out.println("60점 미만 F학점");
    }
    scanner.close();

    
  }
}
