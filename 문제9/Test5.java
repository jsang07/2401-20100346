package test;

import java.util.function.UnaryOperator;

public class Test5 {
    public static void main(String[] args) {
        //인스턴스 메서드를 포함한 클래스를 호출해야지 아래 인스턴스 메서드 참조가 가능하다.
        FirstString f = new FirstString();

        UnaryOperator<String> uoprt = f::startsWith;
        System.out.println(uoprt.apply("야야야야양"));
    }
}

class FirstString {
    String startsWith(String s) {
        return Character.toString(s.charAt(0));
    }
}
