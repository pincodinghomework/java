package section02;

public class Ex0209 {
  public static void main(String[] args) {
    // 실수의 강제 형변환 주의!
    double doubleNum = 1.0e100;
    float floatNum = (float) doubleNum;
    System.out.println(floatNum); // 무한대 (Infinity)

    doubleNum = 1.0e-100; // 1.0 * 10^-100
    floatNum = (float) doubleNum;
    System.out.println(floatNum); // 
  }
}
