package AssignmentPackage;

public class Assignmentt36 {

	public static void main(String[] args) {
		Assignmentt36 repeat = new Assignmentt36();
		int array[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = array.length;
		repeat.printRepeating(array, arr_size);
	}

	void printRepeating(int array[], int size) {
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (array[i] == array[j])
					System.out.print(array[i] + " ");
			}
		}
	}

}
