
public class Lab18 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 1, 0 };

		int sum = 0;
		int times = 0;
		for (int i = 1; i <= arr.length; ++i) {
			int counter = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					counter++;
					System.out.println(counter);
				}

			}

		}

		// if (arr[i] == arr[i - 1]) {
		// ++times;
		// } else {
		// pairs += times * (times - 1) / 2;
		// times = 1;
		// pairs += times * (times - 1) / 2;

		// System.out.println(times);
		// }
		// }
		// return pairs;

	}

}
