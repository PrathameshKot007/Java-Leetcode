package RemoveDuplicatesInArray;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArr {
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArr rD = new RemoveDuplicatesFromSortedArr();
		int[] nums = {-3,-1,0,0,0,3,3};
		System.out.println(rD.removeDuplicates(nums));
	}

	public int removeDuplicates(int[] nums) {
		int k=0;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		
		k= set.size();
		ArrayList<Integer> list = new ArrayList<>(set);
		list.sort(null);
		for(int i=0;i<nums.length;i++) {
			if(i<set.size()) {
				nums[i] = list.get(i);
			}else {
				nums[i]='_';
			}
		}
		return k;
	}
}
