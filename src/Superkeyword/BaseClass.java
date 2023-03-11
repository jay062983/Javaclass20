package Superkeyword;

public class BaseClass {
    String name="John";
    void hello(){
        System.out.println("Hello method from BaseClass");
    }
}
class Child extends BaseClass{
    String name="Jane";
    void callMe(){

        System.out.println(name);
        System.out.println(super.name);
    }
    void hello(){
        System.out.println("Hello method from child class");
    }
    void callingPareantMethod(){
        hello();
        super.hello();
    }
}