interface Calculator{
    void display(int a, int b, String operator, int result);
}
interface Operation extends Calculator{
    void operate(int a,int b);
}

class Add implements Operation{
    public void display(int a,int b, String operator, int result){
        System.out.println(a+operator+b+" = "+result);
    }
    public void operate(int a,int b){
        display(a,b," + ", a+b);
    }
}

public class Main{
    public static void main(String[] args){
        Add add = new Add();
        add.operate(2,3);
        add.operate(4,10);
    }
}