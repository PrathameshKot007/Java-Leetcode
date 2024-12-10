package RemoveElement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {
	
	public static void main(String[] args) {
		RemoveElement re = new RemoveElement();
		int[] nums = {3,2,2,3};
		System.out.println(re.removeElement(nums, 3));
	}
	
	public int removeElement(int[] nums, int val) {
        int repeatCount=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(val==nums[i]){
                nums[i] = '_';
                repeatCount+=1;
            }
        }
        k = nums.length-repeatCount;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.sort(null);
        for(int i=0;i<nums.length;i++) {
        	nums[i] = list.get(i);
        }
        return k;
    }

}
