package OOPS.Inheritance.Polymorphism;

public class X {
    public void getMsg(){
        System.out.println("hello");
    }
}
class Y extends X {
    @Override
    public void getMsg(){
        System.out.println("Hiiiii");
    }
}
class Z{
    public static void main(String[] args) {
        X x = new Y();
        x.getMsg();

    }
}
