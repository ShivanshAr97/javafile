public class Main {
    public static int noOfWorkers=0;
    public String name;
    public Main(String n){
        name = n;
        noOfWorkers++;
    }
    public void count(){
        System.out.println("No of workers: "+noOfWorkers);
    }
    public static void main(String[] args) {
        Main d1 = new Main("Abc");
        Main d2 = new Main("Xyz");
        d2.count();
    }

}
