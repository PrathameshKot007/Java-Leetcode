import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEven {
	
	public static void main(String[] args) {
		OddEven oe = new OddEven();
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		oe.segregateOddEven(list);
	}
	
	public void segregateOddEven(List<Integer> list) {
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			if(list.get(i)%2==0) {
				even.add(list.get(i));
			}else {
				odd.add(list.get(i));
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
