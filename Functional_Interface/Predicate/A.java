package Functional_Interface.Predicate;

import java.util.function.Predicate;

public class A {

    public static void main(String[] args) {
        
        Predicate<String> checkLength = s -> s.length()>5;

        Boolean result = checkLength.test("Satish");
        
        System.out.println(result); //true

    }
    
}
