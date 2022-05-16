
public class FinalValueofVariableAfterPerformingOperations2011 {

	public static void main(String[] args) {

		/*There is a programming language with only four operations and one variable X:

		++X and X++ increments the value of the variable X by 1.
		--X and X-- decrements the value of the variable X by 1.
		Initially, the value of X is 0.

		Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.*/
		
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
