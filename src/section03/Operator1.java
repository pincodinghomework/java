package section03;

public class Operator1 {
    public static void main(String[] args) {
    // 연산자
    // 1.단항연산자(+1, -1)
        // - 부호 : +1, -1
        System.out.println(+1);
        System.out.println(-1);
        // - 증감 : ++, -- 
        int n1 = 1; //
        System.out.println(++n1); //2
        System.out.println(n1++); // 2
        System.out.println(n1); // 3
        System.out.println(--n1); // 2
        System.out.println(n1--); // 2
        System.out.println(n1); // 1
        // 논리 부정(뒤집기) : !
        System.out.println(true); // true
        System.out.println(!true); // false
        System.out.println(!(1 == 2)); // true
        // 2.이항연산자
        // - 산술연산자
        System.out.println(1 + 1); // 2
        System.out.println(1 - 1); // 0
        System.out.println(5 * 2); // 10

        System.out.println(5 / 2); // 2
        System.out.println(5/ 2); // 2
        System.out.println(5.0 / 2.0); // 2.5 실수랑 정수를 가림 
        System.out.println(5 % 2); // 2.5 실수랑 정수를 가림 
        // 짝수/홀수 판별
        System.out.println(5 % 2 == 0); // true 
        System.out.println(5 % 2 == 1); // true 

        // 비교

        // 논리

    // 3.삼항연산자

    }

}
