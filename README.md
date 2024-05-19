Functional interface introduced in version 8 of the Java.

It has only one incomplete method, So we can say that it has only one responsibility.

We can create any number of complete methods inside it by using default keyword, which is also introduced in version 8 of Java.

There are different types of functional interface ->
    1) Predicate
    2) Consumer
    3) Function
    4) Supplier

1) Predicate -> 

    This gives boolean result.

    It will check, if condition is satisfied then will give output as True otherwise False
    
    It has one method that is -> Boolean test();

2) Consumer ->

    It modify the data but does not give any output.

    It has one method that is -> void accept();

3) Function -> 

    It take input and give ouput.

    It has one method -> R apply();

4) Supplier ->

    Gives only output.

    It has one method -> T get();
        
