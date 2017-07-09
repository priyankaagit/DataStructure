package arrays;
import java.util.*;
public class SparseArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String sparse[] = new String[n];
		for(int i = 0;i<n;i++){
			sparse[i] = sc.next();
		}
		int q = sc.nextInt();
		for(int i = 0;i<q;i++){
			String query = sc.next();
			int count = 0;
			for(int j=0;j<n;j++){
				if(query.equals(sparse[j]))
					count++;
			}
			System.out.println(count);
		}

	}

}
