package IndexOfFirstOcurrence;


public class IndexOfFirstOccurrence {
	public static void main(String[] args) {
		IndexOfFirstOccurrence iof = new IndexOfFirstOccurrence();
		String haystack = "sadbutsad", needle = "sad";
		System.out.println(iof.strStr(haystack, needle));
	}

	public int strStr(String haystack, String needle) {
		int index = 0;
		while(index<=haystack.length()-needle.length()) {
			if(haystack.substring(index, index+needle.length()).equals(needle)) {
				return index;
			}else {
				index+=1;
			}
		}
		return -1;
	}
}
