package section02;

public class StringType {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        System.out.println("String : " + a);
        System.out.println("--------" );
        System.out.println("String : " + b);
        System.out.println(a == b);

        // stack, heap
        // new 객체를 생성하는 방식 그래서 터미널에 false 나옴.
        String c = new String("Java");
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true
        // 주소가 다르지만 값을 비교할때는 equals 메서드를 사용하면 된다.

        // ---------------------------------------------------
        System.out.println("여기까지 배운내용");

        String names = "용선";
        System.out.println(names);
        String ax = "용선";
        System.out.println(ax);
        System.out.println(names == ax);

        String axnams = new String("용선");
        System.out.println(names.equals(axnams));

        System.out.println(a.equals(c)); // false
        // 주소가 다르지만 값을 비교할때는 equals 메서드를 사용하면 된다.
}

    
 

}
