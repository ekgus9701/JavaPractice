package edoc_hashing;
import java.io.*;
import java.util.*;
public class 포켓몬마스터_1620 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        Map<String,String> map=new HashMap<>();
        
        for(int i=0;i<n;i++) {
        	String pocketmon = br.readLine();
            String number = Integer.toString(i+1);
            map.put(pocketmon, number);
            map.put(number, pocketmon);
        }
        
        StringBuilder sb = new StringBuilder(m);
        for(int i=0; i<m; i++) {
            sb.append(map.get(br.readLine()) + "\n");
        }
        System.out.print(sb);
    }

}
