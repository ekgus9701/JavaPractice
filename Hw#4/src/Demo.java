

import java.util.*;
public class Demo {

	//컴퓨터공학전공 1971055 한다현
	public static void main(String[] args) {
		int check=0; 
		
		System.out.println("괄호를 포함한 문자열을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		
		StringTokenizer st = new StringTokenizer(s,"{} ()", true); //단어사이의 구분"{","}","(",")", 괄호도 제거하지많고 토큰으로 취급
		
		String ss= ""; //스트링 ss생성
		while(st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			
			if(nextToken.equals("{")) {	//다음토큰이 "{" 와 같다면
				ss = ss.concat("{");	//"{" 추가한다
			}
			if(nextToken.equals("(")) {	//다음토큰이 "(" 와 같다면
				ss = ss.concat("(");	//"(" 추가한다
			}
			
			if(nextToken.equals(")")) {	//다음토큰이 ")" 와 같다면
				ss = ss.concat(")");	//")" 추가한다
			}
			
			if(nextToken.equals("}")) {	//다음토큰이 "}" 와 같다면
				ss = ss.concat("}");	//"}" 추가한다
				
			}
			
			
		}
		System.out.println("괄호만 추출한 스트링:");
		System.out.print(ss); 	//괄호만 추출한 스트링 출력
		System.out.println("\n");
		
		
		StringTokenizer st1 = new StringTokenizer(s,"{} ()", true);		//단어사이의 구분"{","}","(",")", 괄호도 제거하지많고 토큰으로 취급
		ss= ""; 	//스트링 ss 초기화
		
		while(st1.hasMoreTokens()) {
			
			String nextToken = st1.nextToken();
			
			if(nextToken.equals("(")) {		//다음토큰이 "(" 와 같다면
				ss = ss.concat("("); 		//"(" 추가
			}
			
			if(nextToken.equals("{")) {		//다음토큰이 "{" 와 같다면
				ss = ss.concat("{");		//"{" 추가
			}
		
			
			if(nextToken.equals(")")) {
				
				if(ss.isEmpty()) { 	//ss가 비었다면
					System.out.println("이 스트링의 짝이 맞지 않습니다.");
					check=1; //여기서 check는 두가지의 경우로 쓰인다. 1. 이 스트링의 짝이 맞지않는다. 2. "이 스트링의 짝이 맞지않습니다"라는 문구가 출력됐다.
					break;
				}
				else { 	//ss가 비지않았다면
					
					if(ss.substring(ss.length()-1).equals("(")) 	//맨뒤괄호와 같은쌍이라면
						ss=ss.substring(0,ss.length()-1); 	// 열린괄호제거
					else {	//같은쌍이 아니라면
						System.out.println("이 스트링의 짝이 맞지 않습니다."); 
						check=1;	//짝이 맞지않을때 check에 1대입
						break;
					}
						
				
				}
			}
			if(nextToken.equals("}")) { //다음토큰이 "}"와 같다면
				
				if(ss.isEmpty()) {//ss가 비었다면
					System.out.println("이 스트링의 짝이 맞지 않습니다.");
					check=1;
					break;
				}
				
				else {//ss가 비지않았다면
					
					if(ss.substring(ss.length()-1).equals("{")) //맨뒤괄호와 같은쌍이라면
						ss=ss.substring(0,ss.length()-1);  // 열린괄호제거
					else {//같은쌍이 아니라면
						System.out.println("이 스트링의 짝이 맞지 않습니다.");
						check=1;
						break;
					}
				
				}
			}

		}
		if(ss.isEmpty()&&check!=1)  //최종적으로 ss가 비었고  이 스트링의 짝이 맞는다.(위에서 언급한 check의 1의 경우로 쓰인것임)
		 							/* "}"를 예시로 입력해봤는데 ss가 비지만 짝이 맞지않았고
		 							 따라서 ss.isEmpty()만으로 하면 제대로 따져지지않아
			                       	이러한 경우를 해결하기 위해 check를 사용했다.*/
			System.out.println("이 스트링은 짝이 맞습니다!");
		
		
		if(!ss.isEmpty()&&check!=1){//최종적으로 ss가 비지않았고 이미 "이 스트링은 짝이 맞지않습니다" 문구가 나온적이 없다면(위에서 언급한 check의 2의 경우로 쓰인것임)
									/*"{(){())))"를 예시로 입력해봤는데  !ss.isEmpty()만 사용하면 "이 스트링은 짝이맞지않습니다"라는 문구가 2번나오게 된다.
									  그래서 중복문구를 피하기위해 check를 사용했다. */
			System.out.println("이 스트링은 짝이 맞지 않습니다.");
		}
		
		System.out.println("앞부분 남은 괄호는 [ "+ss+" ] 입니다.");
		
	}
	
}

		
		


