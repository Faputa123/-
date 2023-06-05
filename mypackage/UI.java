//ЛАБОРАТОРНАЯ РАБОТА №3 ГОРЯКИНА А.В.
public class UI {

    public static void main(String[] args){
        IOperation[] operations = {new Div(), new Mod(), new Nok(), new Nod()};

        int a = 2240, b = 32;
        for (IOperation op : operations){
            System.out.println(op.getName());
            System.out.printf("%d %s %d = %d \n", a, op.getSign(), b, op.estimate(a, b));
        }
    }
    
}
