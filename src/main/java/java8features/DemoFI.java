package java8features;

public class DemoFI {
    public static void main(String[] args) {
        Welcome welcome = () -> System.out.print("Welcome interface is implementation");
        welcome.welcomeMessage();
    }
}
