package CheckIfDoubleExists;

public class CheckDoubleExists {
	public static void main(String[] args) {
		CheckDoubleExists cd = new CheckDoubleExists();
		int[] arr = {10,2,5,3};
		System.out.println("The result is" + cd.checkIfExist(arr));
	}
	
	public boolean checkIfExist(int[] arr) {
        int size = arr.length;
        for(int i=0;i<size;i++) {
        	int prod = 2*arr[i];
        	System.out.println(prod);
        	for(int j=0;j<size;j++) {
        		if(i!=j && prod==arr[j]) {
        			return true;
        		}
        	}
        }
        return false;
    }
}
