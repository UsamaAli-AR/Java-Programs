import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
	
			Scanner scanner = new Scanner(System.in);
		
		
				int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	
		System.out.print("Enter a number to search:");
		int target = scanner.nextInt();
		
		int s = 0;
		int e = array.length - 1;
		
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (array[mid] == target) {
				System.out.println("Element found at index " + mid);
				break;
			} else if (array[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		if (s > e) {
			System.out.println("Element not found in array");
		}
	}
}
