package section02;

public class DataType {
    public static void main(String[] args){
        // 정수
        int age = 10;
        System.out.println("제 나이는" + age + "입니다.");
        age = 2147483647 + 1000;
        System.out.println("제 나이는" + age + "입니다.");


        Long num  = 214748364L + 1000L;
        // * long 타입을 쓸때는 L 붙여줘야한다.
        System.out.println("제 나이는" + num + "입니다.");

        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // 용선 복습 정수
        short axd = 10000;
        System.out.println("axd"+axd);

        int testInt = 1000000000;
        System.out.println("int"+ testInt);
        // 정수 :  short, int는 뒤에 붙여주지않음
        Long ages = 10L;
        ages = 2000000000000000000L;
        System.out.println("short"+ages);
        // 정수 Long 정수명뒤에 L(대문자)넣어줘야됨

        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------




        // * 실수
        // *  값(리터럴)에 f 추가 
        float pi = 3.14f;
        System.out.println("float" + pi + "입니다");

        double height = 185.9d;
        System.out.println("height " + height);

        float overflow = 3.14159265359f;
        System.out.println("float_overflow" + overflow); // 3.145927

        // 더 정밀한 실수 값은 double 사용
        double overflowDouble = 3.14159265359D;
        System.out.println("float_overflow" + overflowDouble); // 3.145927

        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //용선 복습 실수

        float consts = 3.14f;
         //float는 뒷자리 7까지만나옴
        System.out.println("용선복습 실수 float"+consts);
        double constes = 3.123456789999989999999999D;
        System.out.println("용선복습 double" + constes);
        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // 8진수
        // 8진수는 앞에 0을 붙여야한다
        int octal = 023;
        System.out.println("8진수 23 :" + octal);

        // 16진수
        // 16진수는 0x 를 붙여야한다.
        int hex = 0x23;
        System.out.println("8진수 23 :" + hex);

        // 문자 (char)
        char c = 'c';
        System.out.println("char : " + c);
        c = 100;
        System.out.println(c);

        // 불리언(boolean)
        boolean b = true;
        System.out.println("true : " + b);
        b = false;
        System.out.println(b);
        // b = "true"; 불리언에 문자열은 할당 할 수 없다.
        b = 1 > 2;
        // 1이 더 크다 false
        System.out.println(b);
        b = 1 < 2; // 2가 크다.
        System.out.println(b);

        b = 1 <= 2 ; // 2가 1보다 크거나 같다.
        System.out.println(b);

    }
}
