package section18;

import java.util.Scanner;

public class Practice1803 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("이름을 입력하세요 :");
    String name = scanner.next();

    System.out.print("나이를 입력하세요 :");
    int age = scanner.nextInt();

    System.out.print("키를 입력하세요 :");
    double height = scanner.nextDouble();

    System.out.printf("이름:%s, 나이 :%d, 키 :%.2f \n", name, age, height);
    scanner.close();
  }
}
