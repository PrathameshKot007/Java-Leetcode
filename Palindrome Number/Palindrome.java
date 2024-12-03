class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        int left =  0;
        int right = str.length() - 1;
        while(left<right) {
        	if(str.charAt(left) != str.charAt(right)) {
        		return false;
        	}
        	left++;
        	right--;
        }
        return true;
    }    
}