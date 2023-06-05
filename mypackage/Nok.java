public class Nok implements IOperation {
    @Override
    public String getName(){
        return "Наименьшее общее кратное";
    }

    @Override
    public String getSign(){
        return "НОК";
    }

    @Override
    public int estimate(int a, int b){
        if (a == 0 || b == 0) return 0;
        else {
            int absa = Math.abs(a);
            int absb = Math.abs(b);
            int biggerv = Math.max(absa,absb);
            int smallerv = Math.min(absa,absb);
            int nok = biggerv;
            while (nok % smallerv !=0) nok+=biggerv;
            return nok;
        }
    } 
}
