package StringReversal;

public class StringReverse {
    public static void main(String[] args) {
		StringReverse sr = new StringReverse();
		System.out.println(sr.ReverseString("PRATHAMESH"));
	}
	
	private String ReverseString(String str) {
		String result = "";
		for(int i=str.length()-1;i>=0;i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
}
