import java.util.Arrays;

public class DecompressRunLengthEncodedList1313 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};

		System.out.println(Arrays.toString(decompressRLElist(array)));
	}
	
	public static int[] decompressRLElist(int[] nums) {
		
		int[] store = new int[nums.length];
		int val1 = 0;
		
		for (int i = 0; i < nums.length/2; i++) {
			
			store[2*i] = nums[i];
			store[2*i+1] = nums[i+1];
			
		}
		
		return store;
		
	}

}
