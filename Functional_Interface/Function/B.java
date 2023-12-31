package Functional_Interface.Function;

import java.util.function.Function;

public class B {

    public static void main(String[] args) {
        
        Function<Integer, String> f = t -> t*2 + " number is multiplied by 2";
        String result = f.apply(20);
        System.out.println(result);

    }
    
}
