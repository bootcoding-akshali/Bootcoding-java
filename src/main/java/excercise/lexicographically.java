package excercise;

public class lexicographically {
    public static void main(String[] args) {
      getLexicographically();
    }
    public static void getLexicographically(){
        String s1 = "Almond";
        String s2 = "coffee";
        String s3 = "Break";
        String s4 = "Namkin";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s4));
    }
}
