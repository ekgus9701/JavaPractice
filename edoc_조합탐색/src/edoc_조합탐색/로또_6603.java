package edoc_����Ž��;
import java.util.Arrays;
import java.util.Scanner;

public class �ζ�_6603 {
	static int K;
    static int[] iArr;
    static int count;
    static StringBuffer sb=new StringBuffer();
    static void dfsForRecursive(int v,String str) {
        if(count==6) {
            sb.append(str+"\n");
        }
        else {
            for(int i=v+1;i<K;i++) {//v+1�� ������ ������ ���Դ� ������� �ߺ��� �����ʰ��Ϸ���
                ++count;
                dfsForRecursive(i, str+iArr[i]+" ");
            }
        }
        --count;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        while((K=sc.nextInt())!=0) {//0�̾ƴϸ� ��� �ޱ�
            iArr=new int[K];
            for(int i=0;i<K;i++) {
                iArr[i]=sc.nextInt();
            }
            for(int i=0;i<K;i++) {
                count=1;
                dfsForRecursive(i,iArr[i]+" ");
            }
            
            sb.append("\n");
        }
        System.out.println(sb.toString());

	}

}
