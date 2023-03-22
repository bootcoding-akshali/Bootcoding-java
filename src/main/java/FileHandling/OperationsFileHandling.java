package FileHandling;

import java.io.File;

public class OperationsFileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\MySample.txt");
            if(file.exists()){
                //getting file name
                System.out.println("The name of the file is: "+ file.getName());

                //absolute path
                System.out.println("Absolute path: "+ file.getAbsolutePath());

                // checking file writable or not
                System.out.println("Is File writable: "+ file.canWrite());

                //Checking file readable or not
                System.out.println("Is File readable: "+ file.canRead());

                //getting length of file
                System.out.println("The size of the file in in terms of bytes:"+ file.length());
            }
            else{
                System.out.println("File does not exist");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
