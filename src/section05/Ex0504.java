package section05;

public class Ex0504 {
  public static void main(String[] args) {
    int number = 1;
    while (number <= 10) {
      number++;
      if(number % 2 != 0){
        continue;
      }
      System.out.printf("%d",number);
    }
  }
}