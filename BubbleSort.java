
public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {5, 2, 8, 3, 1, 6, 4};

		System.out.println("\tBefore sorting:");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");
		}

		System.out.println();

for (int i = 0; i < array.length - 1; i++) {
	for (int j = 0; j < array.length - i - 1; j++) {
	
	if (array[j] > array[j + 1]) {
					
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("\tAfter sorting:");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
}
