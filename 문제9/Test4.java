package test;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Test4 {
    public static void main(String[] args) {
        int[] ganInt = { 10, 100, 1000 };

        ToIntFunction<String> tif = x -> x.length();
        UnaryOperator<Integer> uor = x -> {
            Integer i;
            for (i = 0; x != 0; i++)
                x /= 10;
            return i;
        };

        System.out.println("ToIntFunction :");
        for (int i = 0; i < ganInt.length; i++) {
            System.out.println("length(" + ganInt[i] + ") = " + tif.applyAsInt(String.valueOf(ganInt[i])));
        }

        System.out.println("\nUnaryOperator :");
        for (int i = 0; i < ganInt.length; i++) {
            System.out.println("length(" + ganInt[i] + ") = " + uor.apply(ganInt[i]));
        }
    }
}


