package edoc_��������;
import java.util.*;
public class Z_1074 {
	

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int r = scan.nextInt();
	        int c = scan.nextInt();
	        n = (int)Math.pow(2, n);
	        int x = 0;
	        int y = 0;
	        int ans = 0;
	 
	        while(n > 1) {
	            n /= 2;
	            // 1 ���� ��
	            if(r < x+n && c < y+n) {
	                //�ƹ��͵� �߰����� �ʴ´�.
	            }
	            // 2 ������ ��
	            else if(r < x+n && c >= y+n) {
	                ans += n * n * 1; //Ƚ�� �߰�
	                y += n; //������ ���� ��ġ �̵�
	            }
	            // 3 ���� �Ʒ�
	            else if(r>= x+n && c < y+n) {
	                ans += n * n * 2;
	                x += n;
	            }
	            // 4 ������ �Ʒ�
	            else {
	                ans += n * n * 3;
	                x += n;
	                y += n;
	            }
	        }
	        System.out.println(ans);
	    

	}
	

}
