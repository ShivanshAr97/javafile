import java.util.*;

public class Main {

	public static void main(String args[]) throws Exception
	{

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int index = Arrays.binarySearch(array, 2);

		if (index >= 0)
			System.out.println("Element 2 found at index: "
							+ index);
		else
			System.out.println("Element not found");
	}
}
