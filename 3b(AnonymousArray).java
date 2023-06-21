public class Main{
    static int sum(int [] arr){
        int result = 0;
        for(int i:arr){
            result+=i;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Sum of elements of array: "+sum(new int[] {5,9,8,2,1}));
    }
}