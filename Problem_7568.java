import java.util.Scanner;

public class Problem_7568 {

	public static void main(String[] args) { // 덩치
		
		
		int N, weight, height;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int[][] person = new int[N][3];
		for(int i=0; i<N; i++) {
			person[i][0] = scan.nextInt();
			person[i][1] = scan.nextInt();
			person[i][2] = 1;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++){
				if(person[i][0]<person[j][0]&&person[i][1]<person[j][1])
					person[i][2] += 1;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(person[i][2]+" ");
		}
		
	}
}
