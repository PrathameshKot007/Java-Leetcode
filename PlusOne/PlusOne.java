package PlusOne;


public class PlusOne {
	public static void main(String[] args) {
		PlusOne po = new PlusOne();
		int[] digits = {9,9,9};
		System.out.println(po.plusOne(digits));
	}

	public int[] plusOne(int[] digits) {
		int size = digits.length;
		for(int i=size-1;i>=0;i--) {
				if(digits[i] < 9) {
					digits[i]+=1;
					return digits;
			}
				digits[i] = 0;
		}
		int[] result = new int[size+1];
		result[0] = 1;
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
		return result;
	}
}
