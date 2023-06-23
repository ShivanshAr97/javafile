import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] inputArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the element to be searched in the array: ");
        int k = scanner.nextInt();

		System.out.println(Find(inputArray,k));
		
		Sort(inputArray);
		
		for(int i=0;i<inputArray.length;i++){
		    System.out.println(inputArray[i]);
		}
        
        scanner.close();
    }

	public static int Find(int[] arr, int target){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
	
	public static void Sort(int[] arr){
	    int temp;
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i]>arr[j]){
    	            temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
	            }
	        }
	    }
	}
}
