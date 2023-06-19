class ImplementClass{
    void display(){
        System.out.println("Implementing Class");
    }
}

public class Main{
    public static void main(String[] args){
        ImplementClass anony = new ImplementClass(){
            void display(){
                System.out.println("Anonymous Inner Class");
            }
        };
        ImplementClass implement = new ImplementClass();
        implement.display();
        anony.display();
    }
}
