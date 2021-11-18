import java.util.Arrays;
import java.util.Random;

public class Sorter {
	private int[] nums;

	Sorter(int length) {
		nums = new int[length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			nums[i] = random.nextInt(100);
		}
	}

	public void bogoSort() {
		while (!isSorted()) {
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
		for (int i = nums.length - 1; i >= 0; i--) {
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
}
