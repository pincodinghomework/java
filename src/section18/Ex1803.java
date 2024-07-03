package section18;

public class Ex1803 {
  public static void main(String[] args) {
    // System.out.println(String.format("I eat %d apples.", 5));
    // System.out.printf("I eat %d applse.\n",5);
    // System.out.printf("I eat %.2f applse.\n",2.5); // %.2f 소수점 두자리까지
    // System.out.printf("I eat %s apples.\n","five");
    // System.out.printf("I eat %s apples.\n",2.50);
    System.out.printf("I have completed %d%% of my %s studies. \n", 100 , "Java");
    System.out.printf("I have completed %3d%% of my %s studies. \n", 90 , "Java");
    System.out.printf("I have completed %-3d%% of my %s studies. \n", 90 , "Java"); // - 는 왼쪽으로 정렬
    System.out.printf("I have completed %.2f%% of my %s studies. \n", 99.999999 , "Java");  // 반올림 , 반올림하기 싫으면 문자열로 바꾸면됨 "99.999999"
  }
}
// \n 줄바꿈
// %d 서식문자
// %s 문자


