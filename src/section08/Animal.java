package section08;

public class Animal {
    // 멤버는 인스턴스, 정적 나눠진다
    // 인스턴스는 우리가 객체를 생성할때 메모리에 올라간다 
    // 멤버 안에는 속성,기능 이있다
    // 속성 기능 안에는
    // 속성 : 필드(field), 변수 상수
    // 메서드 : 기능(method) 
    // 객체명 객체 변수는 다르다
    String name;
    // String name = "Navi";
    // name = 'Navi'; // 필드에서 이 방법으로 초기화 안됨

    public void setName(String n){
        name = n;
    }
}
