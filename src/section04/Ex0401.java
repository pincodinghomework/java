package section04;

public class Ex0401 {
  public static void main(String[] args) {
    System.out.println("주문하신 커피가 나왔습니다.");
    System.out.println("시럽을 넣어 드릴까요??.");

    boolean responseBoolean = true;

    if (responseBoolean) {
      System.out.println("시럽을 넣었습니다.");
    }
    System.out.println("만족도 조사를 참여 하시겠어요??");
    System.out.println();
    System.out.println("질문1: 다음에도 저희 매장에 방문하시겠어요? (0,x)");

    char responseChar = 'O';
    if (responseChar == 'O') {
      System.out.println("O를 체크하셨습니다.");
    } else {
      System.out.println("X를 체크하셨습니다.");
    }
    System.out.println();
    System.out.println("질문2 : 오늘 커피 맛에 만족하시나요? (만족,보통,불만족)");

    int reponseInt = 5;
    if (reponseInt == 1) {
      System.out.println("1. 매우만족");
    } else if (reponseInt == 2) {
      System.out.println("2. 만족");
    } else if (reponseInt == 3) {
      System.out.println("3. 보통");
    } else if (reponseInt == 4) {
      System.out.println("4.불만족");
    } else {
      System.out.println("5.매우불만족");
    }
    System.out.println();

    switch (reponseInt) {
      case 1:
        System.out.println("1.매우만족");
        break;
      case 2:
        System.out.println("2.만족");
        break;
      case 3:
        System.out.println("3.보통");
        break;
      case 4:
        System.out.println("4.불만족");
        break;
      case 5:
      System.out.println("5.매우불만족");
        break;
      default:
      System.out.println("없음");
    }

  }
}
