import java.util.Arrays;
import java.util.Random;

public class Sorter {
	private int[] nums;

	public int getCount() {
		return count;
	}

	private int count;

	Sorter(int length) {
		nums = new int[length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			nums[i] = random.nextInt(100);
		}
	}

	public void bogoSort() {
		while (!isSorted()) {
			count++;
			shuffle();
		}
	}

	public boolean isSorted() {
		for (int i = 0; i < nums.length - 1; i++){
			if (nums[i] > nums[i+1]) {
				return false;
			}
		}
		return true;
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = nums.length - 1; i > 0; i--) {
			int randomIndex = random.nextInt(i);
			int temp = nums[randomIndex];
			nums[randomIndex] = nums[i];
			nums[i] = temp;
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(nums);
	}

	public void mergeSort() {

	}

	private void merge(int[] a, int[] left, int[] right) {
		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (rightIndex >= right.length || leftIndex < left.length && left[leftIndex] < right[rightIndex]) {
				a[i] = left[leftIndex];
				leftIndex++;
			} else {
				a[i] = right[rightIndex];
				rightIndex++;
			}
		}
	}
}
