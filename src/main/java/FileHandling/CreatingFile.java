package FileHandling;

import java.io.File;

public class CreatingFile {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\MySample.txt");
            if(file.createNewFile()){
                System.out.println("File "+ file.getName()+ " created Successfully");
            }
            else{
                System.out.println("File already exist");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}


