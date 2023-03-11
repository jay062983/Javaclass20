package Superkeyword;

public class Child1 extends Parent {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.hello();
        c1.bye();// not a right way to access bye method
        Child1.bye();//accessible because extends keyword.
        Parent.bye();//accessible because same class
      //  c1.money(); not accessible because it's private

    c1.name="Mark";
    Child1.lastname="traton";
    }

}
