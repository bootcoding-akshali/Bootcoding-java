package constructor;

public class ConstructorParameter {
    int x;
    public ConstructorParameter(int y){
        x=y;
    }
    public static void main(String[] args) {
    ConstructorParameter constructorParameter =new ConstructorParameter(5);
        System.out.println(constructorParameter.x);
    }
}
