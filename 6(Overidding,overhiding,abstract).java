abstract class Parent{
    abstract void func();
}

class Child extends Parent{
    void func(){
        System.out.println("Child");
    }
    static void func2(){
        System.out.println("Func2");
    }
}

class Hiding extends Child{
    static void func2(){
        System.out.println("Hiding");
    }
}
class Main{
    public static void main(String [] args){
        Parent obj2 = new Child();
        obj2.func();

        Hiding.func2();
    }
}