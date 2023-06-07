package java8features;
@FunctionalInterface
public interface Welcome {
    public void welcomeMessage();

    default void methodOne(){
        System.out.println("method one");
    }

    default void methodTwo(){
        System.out.println("method two");
    }
}
