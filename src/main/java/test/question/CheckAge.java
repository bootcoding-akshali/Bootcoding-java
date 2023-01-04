package test.question;

public class CheckAge {
    public static void main(String[] args) {
        int[] a ={25,12,5,35,60,17};
        System.out.println(isSeniorCitizen(a));

    }
    public static Boolean isSeniorCitizen(int a[]){
        for (int i=0;i<a.length;i++){
            if (a[i] < 60){
                return true;
            }
        }
        return false;
    }
}
