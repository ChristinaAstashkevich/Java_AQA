
public class MethodsBaseDdt {

     public static int calculateAddition(int x, int y){
        Mathematics m = new Mathematics();

        m.add(x,y);
        return m.getResult();
    }

    public static int calculateDeduction(int x, int y){
        Mathematics m = new Mathematics();

        m.setResult(1);
        m.deduct(x,y);
        return m.getResult();
    }

    public static int calculateMultiplication(int x, int y){
        Mathematics m = new Mathematics();

        m.multiply(x,y);
        return m.getResult();
    }

    public static int calculateDivision(int x, int y){
        Mathematics m = new Mathematics();

        m.divide(x,y);
        return m.getResult();
    }
}
