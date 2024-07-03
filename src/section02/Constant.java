package section02;

public class Constant {
    // main + Tab키 메인 메서드 자동완성
    public static void main(String[] args){
        final double CONSTANT_PI = 3.14;
        //  * final : 상수(바뀌지 않는 수)
        // * 작명 방식
        //  ? 상수는 : _스네이크 케이스 : _
        // ? 자바에서는 파스칼 케이스  : final double PascalCase
        // ?  변수로 할때는 카멜 케이스 : camelCase(lower camel case)
        // ! 상수는 대문자로 작성해야 된다
        // ! a = 4.14; (상수는 바뀔수 없음)
        System.out.println(CONSTANT_PI);

        final double AGE_BOY = 20.123123123134D;
        final float AGE_G = 21.12313156456456F;

        System.out.println(AGE_BOY);
        System.out.println(AGE_G);
      
    }
}
