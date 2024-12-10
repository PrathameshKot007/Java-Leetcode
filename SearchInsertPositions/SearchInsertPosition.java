package SearchInsertPositions;

public class SearchInsertPosition {
	public static void main(String[] args) {
		SearchInsertPosition sIp = new SearchInsertPosition();
		int[] nums = {1,3,5,6};
		System.out.println(sIp.searchInsert(nums, 5));

	}

	public int searchInsert(int[] nums, int target) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(target>nums[i]) {
				count+=1;
			}
			if(target==nums[i] || target<nums[i]) {
				return i;
			}else if (count==nums.length) {
				return count;
			}
		}
		return count;
	}
}
