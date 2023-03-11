package Superkeyword;

public class Superclass {
    Superclass(){
        System.out.println("I am a constructor from the parent class");
    }
}
class SubClass extends Superclass{
SubClass(){
 // super();  // makes a call to the parent class constructor
    System.out.println("I am a child constructor");
}
}