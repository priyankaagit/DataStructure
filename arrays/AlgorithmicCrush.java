package arrays;
import java.util.*;
public class AlgorithmicCrush {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long crush[] = new long[n];
		for(int i = 0;i<m;i++){
			long a = sc.nextInt();
			long b = sc.nextInt();
			long k = sc.nextInt();
			for(int j = (int) (a-1);j<b;j++){
				crush[j] = crush[j]+ k;
			}
		}		
		Arrays.sort(crush);		
		System.out.println(crush[crush.length-1]);
		
	}

}
