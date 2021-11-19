public class SorterClient {
	public static void main(String[] args) {
		Sorter sorter = new Sorter(11);
		System.out.println(sorter);
		sorter.mergeSort();
		//sorter.bogoSort();
		System.out.println(sorter);
		System.out.println("The sort took " + sorter.getCount() + " \"iterations\"");
	}
}
