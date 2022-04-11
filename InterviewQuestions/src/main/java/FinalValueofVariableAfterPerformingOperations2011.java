
public class FinalValueofVariableAfterPerformingOperations2011 {

	public static void main(String[] args) {
		String [] str = {"++X","++X","X++"};
		System.out.println(finalValueAfterOperations(str));
	}
	
	public static int finalValueAfterOperations(String[] operations) {
		int store = 0;

		for (int i = 0; i < operations.length ; i++){

			if (operations[i].contains("+")) {
				store += 1;
			}else {
				store -= 1;
			}
		}
		
		return store;
	}

}
