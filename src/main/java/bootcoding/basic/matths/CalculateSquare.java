package bootcoding.basic.matths;

public class CalculateSquare {

    public static void main(String[] args) {
        CalculateSquare maths = new CalculateSquare();
        maths.getAsquareMinusBsquare();
        maths.getAPlusBWholeSquare(3,5);
    }

    public int getAsquareMinusBsquare(){
        int a = 2;
        int b = 3;
        a = a*a;
        b = b*b;
         int result = a-b;
        System.out.println("The Output of a^2 – b^2 = (a – b)(a + b) is :" +result);
        return result;

    }

    public int getAPlusBWholeSquare(int a ,int b){
        return  a*a + b*b + 2*a*b;

    }

//    public int getAMinusBWholeSquare(int a, int b){
//        return
//    }
}
