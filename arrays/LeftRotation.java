package arrays;
import java.util.*;
public class LeftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int array[] = new int[2*n];
		for(int i = 0;i<n;i++){
			array[i]=sc.nextInt();
			array[i+n]=array[i];
		}
	    for(int i = 0; i<n;i++){
	    	System.out.print(array[d+i]);
	    	if(i<n)
	    	System.out.print(" ");
	    }
	}

}
