package excercise;

public class CheckNoDivisible {
    public static void main(String[] args) {
        CheckNoDivisible p = new CheckNoDivisible();
        p.checkDivisible(12 );
    }


        public void checkDivisible ( int no){
            if (no % 3 == 0 && no % 5 == 0) {
                System.out.println("Number "+no+"is Divisible by 3 and 5");

            } else if(no % 5 == 0){
                System.out.println("Number "+no+" is  divisible by 5");
            } else if (no % 3 == 0) {
                System.out.println("Number " + no + " is divisible by 3");
            }
        }

    }
