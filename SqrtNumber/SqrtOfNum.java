package SqrtNumber;

public class SqrtOfNum {
	public static void main(String[] args) {
		SqrtOfNum sq = new SqrtOfNum();
		System.out.println(sq.mySqrt(8));
	}
	
	public int mySqrt(int x) {
		double num = x;
		double result = Math.sqrt(num);
        return (int)(result);
    }
}
