package bootcoding.basic.matths.String;

public class Contains {
    public static void main(String[] args) {
        String str1 = "hello World";
        boolean result;

        result = str1.contains("hello");
        System.out.println(result);

        result = str1.contains("hey");
        System.out.println(result);
        result = str1.contains(" ");
        System.out.println(result);
    }
}
