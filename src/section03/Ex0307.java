package section03;

public class Ex0307 {
  public static void main(String[] args) {
    // 이항 - 논리 연산자
    // 논리곱(AND)
    System.out.println("true && true :" + (true && true));
    System.out.println("true && false :" + (true && false));
    System.out.println("false && true :" + (false && true));
    System.out.println("false && false :" + (false && false));
    // 논리(OR)
    System.out.println("true || true :" + (true || true));
    System.out.println("true || false :" + (true || false));
    System.out.println("false || false : " + (false || false));
    // 배타적논리(XOR)

    System.out.println("true ^ true :" + (true ^ true));
    System.out.println("false ^ true :" + (false ^ true));
    System.out.println("true ^ false :" + (true ^ false));
    System.out.println("false ^ false :" + (false ^ false));
  }
}
