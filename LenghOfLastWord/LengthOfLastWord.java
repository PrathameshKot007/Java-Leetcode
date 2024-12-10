package LenghOfLastWord;

public class LengthOfLastWord {
	public static void main(String[] args) {
		LengthOfLastWord lol = new LengthOfLastWord();
		System.out.println(lol.lengthOfLastWord("Hello World"));
	}

	public int lengthOfLastWord(String s) {
		String[] splitter = s.split(" ");
		int lastWord = splitter.length;
		return splitter[lastWord-1].length();
	}
}
