package arrays;
import java.util.*;
public class DynamicArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int q = sc.nextInt();
		List<Integer>seqList[] = new ArrayList[n];
		Collections.nCopies(n,0);
		for(int i = 0;i<seqList.length;i++){
			seqList[i]= new ArrayList<Integer>();
		}
		int lastAnswer = 0;
		for(int i = 0;i<q;i++){
			int seq = sc.nextInt();			
			if(seq == 1){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int index = (x^lastAnswer)%n;								
			    seqList[index].add(y);				    
			}
			if(seq == 2){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int index = (x^lastAnswer)%n;
				lastAnswer = seqList[index].get(y%seqList[index].size());
				System.out.println(lastAnswer);
			}
			
		}

	}

}
