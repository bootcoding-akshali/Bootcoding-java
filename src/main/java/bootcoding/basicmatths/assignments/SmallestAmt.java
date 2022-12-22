package bootcoding.basicmatths.assignments;

public class SmallestAmt {
    public static void main(String[] args) {
      getSmallestAmt(375);
    }
    public static void getSmallestAmt(int amt){
        int total;
        total = amt/100;
        amt = amt - (total * 100);
        System.out.println(total);
        total = amt/50;
        amt = amt - (total * 50);
        System.out.println(total);
        total = amt/20;
        amt = amt - (total * 20);
        System.out.println(total);
        total = amt/10;
        amt = amt - (total * 10);
        System.out.println(total);
        total = amt/5;
        amt = amt - (total * 5);
        System.out.println(total);
        total = amt/2;
        amt = amt - (total * 2);
        System.out.println(total);
        total = amt/1;
        amt = amt - (total * 1);
        System.out.println(total);
    }
}
