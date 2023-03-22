package FileHandling;

import java.io.FileInputStream;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("Sample.text");
            int ch;
            while((ch= fin.read()) != -1){
                System.out.print((char) ch);
            }
            fin.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

