package excercise;

public class SwitchExample {
    public static void main(String[] args) {
printButton(3);
    }
    public static void printButton(int button){
//        if (button ==1){
//            System.out.println("Hello");
//        } else if (button ==2) {
//            System.out.println("Namaste");
//
//        } else if (button==3) {
//            System.out.println("Banjour");
//
//        }else {
//            System.out.println("Invalid Button");
//        }

        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                    System.out.println("Namaste");
                    break;
            case 3:
                        System.out.println("Bonjour");
                        break;
            default:
                System.out.println("Invalid Button");

        }
    }
}
