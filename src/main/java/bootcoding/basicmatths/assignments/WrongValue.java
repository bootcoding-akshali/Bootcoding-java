package bootcoding.basicmatths.assignments;

public class WrongValue {
    public static void main(String[] args) {
        getAns(35, 15, 46, 2);
    }

    public static void getAns(int p, int q, int r, int s) {
        if (r > s && q > r && p % 2 == 0) {
            if (q > r && s > p && r + s > p + q) {
                System.out.println("Correct Value");
            } else {
                System.out.println("Wrong Value");

            }
        }
    }
}