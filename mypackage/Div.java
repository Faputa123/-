public class Div implements IOperation {

    @Override
    public String getName(){
        return "DIV";
    }

    @Override
    public String getSign(){
        return "/";
    }

    @Override
    public int estimate(int a, int b){
        return a/b;
    }
    
}
