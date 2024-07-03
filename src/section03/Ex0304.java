package section03;

public class Ex0304 {
  public static void main(String[] args) {
    // ! : 논리 부정 연산자
    int age = 20;
    boolean isAult = age >= 19;

    System.out.println("isAult\t :" + isAult);
    System.out.println("!isAult\t :" + !isAult);
    System.out.println("!(isAult = !isAult)\t :" + !(isAult = !isAult));
    
  }
}
