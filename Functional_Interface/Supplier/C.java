package Functional_Interface.Supplier;

import java.util.function.Supplier;

public class C {
    
    public static void main(String[] args) {
        
        Supplier<Double> s = () -> Math.random();

        Double result = s.get();
        System.out.println(result);
    }
}
