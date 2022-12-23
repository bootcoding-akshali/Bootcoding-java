package bootcoding.basicmatths.assignments;

public class SmallestAmt {
    public static void main(String[] args) {
      getSmallestAmt(375);
    }
    public static void getSmallestAmt(int amt){
        int [] currency = {100,50,20,10,5,2,1};
        while (amt != 0){
            for(int i=0; i< currency.length;i++){
                float total = amt/currency[i];
                amt = amt%currency[i];
                System.out.println(total);
            }
        }
    }
}
