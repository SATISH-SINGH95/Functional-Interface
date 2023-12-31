package Functional_Interface.Consumer;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        
        Person p = new Person();

        Consumer<Person> setName = t -> t.setName("satish");

        setName.accept(p);

        System.out.println(p.getName());
    }
    
}
