public class SorterClient {
	public static void main(String[] args) {
		Sorter sorter = new Sorter(10);
		System.out.println(sorter);
		sorter.bogoSort();
		System.out.println(sorter);
	}
}
