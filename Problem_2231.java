import java.util.Scanner;

public class Problem_2231 { //분해합 문제

	public static void main(String[] args) {
		
		int total_num, prive_num, num, sum;
		Scanner scan = new Scanner(System.in);
		total_num = scan.nextInt();
		
		for(int i=1; i<=total_num; i++) {
			num = i;
			sum = 0;
			while(num!=0){
	            //num을 10으로 나눈 나머지를 sum에 더한다.
	            sum += num%10;
	            //num을 10으로 나눈 값을 다시 num에 저장한다.
	            num /= 10;
	        }
			prive_num = i+sum;
			if(prive_num == total_num) {
				System.out.println(i);
				break;
			}
			if(i==total_num) {
				System.out.println("0");
				break;
			}
		}
		scan.close();
	}
}
