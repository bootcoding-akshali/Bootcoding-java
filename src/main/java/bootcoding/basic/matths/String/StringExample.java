package bootcoding.basic.matths.String;

public class StringExample {
    public static void main(String[] args) {
        //Concatenation
        String firstName = "Tony";
        String lastName = "stark";
        String fullName = firstName +  " " + lastName;
        System.out.println(fullName.length());

        //charAt
        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
