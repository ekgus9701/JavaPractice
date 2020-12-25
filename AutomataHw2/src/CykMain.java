import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CykMain {
	//컴퓨터공학전공 1971055 한다현
	
	private static int ruleCnt = 0;
	private static HashMap<String, ArrayList<String>> ruleMap = new HashMap<String, ArrayList<String>>(); 
	//String 타입인 key값과 배열형태면서 String타입인 value 값을 쌍으로 지닐 수 있는 객체 ruleMap을 만들어냄
	private static String w;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("규칙의 개수를 입력하세요=>");
		ruleCnt = sc.nextInt(); //규칙의 개수 입력받음
		sc.nextLine();
		System.out.println(ruleCnt + "개의 규칙을 입력하세요");
		for(int i = 0; i<ruleCnt; i++){
			String lnstr = sc.nextLine(); //규칙입력
			String[] str = lnstr.split(">"); //>을 기준으로 나눔
			if(str.length == 2){ //길이가 2라면
				String key = str[1]; //key에 str[1]에 저장되어있는 String 대입
				ArrayList<String> lst = ruleMap.get(key.trim()); //1st에 ruleMap에서 가져온 key를 대입
				if(lst == null){
					lst = new ArrayList<String>();
					lst.add(str[0].trim()); //해당 룰에 변수를 추가
					ruleMap.put(key, lst); //key,1st 쌍으로 넣어줌
				}
				else //1st가 null이 아니라면
					lst.add(str[0].trim()); //해당 룰에 변수를 추가
			}
			else{ //error handle
			}
		}
		
		HashMap<Integer, ArrayList<String>> parseVarMap = new HashMap<Integer, ArrayList<String>>();
		//Integer 타입인 key값과 배열형태면서 String타입인 value 값을 쌍으로 지닐 수 있는 객체 parseVarMap을 만들어냄
		System.out.println("\n멤버 확인이 필요한 문자열을 입력하세요.");
		w = sc.nextLine().trim(); //문자열 입력
		int wlen = w.length(); //wlen은 w의길이
		
		for(int len=1; len<=wlen; len++){ //w의 substring길이를 1부터 하나씩 증가
			for(int i=1, j=len; j<=wlen; i++, j++){ //한줄의 각 셀에 들어갈 수 있게한다
				Integer newkey = makeKey(i,j,wlen);  // (i, j) Key 만드는 메소드를 사용해 newkey 생성
				ArrayList<String> newVars = new ArrayList<String>(); //배열형태면서 String 타입인 객체 newVars 생성
				//V(ij)
				if(len == 1){ //즉, 11 22 33 44 55...인 경우
					String findkey = w.substring(i-1, i); //심볼 추출
					ArrayList<String> ruleVar = ruleMap.get(findkey); //심볼을 갖고 있는 변수 찾기
					if(ruleVar != null && !ruleVar.isEmpty()){ //ruleVar이 비어있지않다면
						for(String var : ruleVar){ 
							newVars.add(var); //newVars에 var을 더해줌
						}
						parseVarMap.put(newkey, newVars); //newkey에 newVars에 있는값 넣어줌
					}
					continue;
				}
				else{ //길이가 1이 아니라면
					for(int k=i; k<j; k++){
						Integer key1 = makeKey(i,k,wlen); //key1 생성
						Integer key2 = makeKey(k+1,j,wlen); //key2생성
						//V(i,k)V(k+1,j)
						for(String var1 : parseVarMap.get(key1)){ //parseVarMap에서 key1을 찾아옴
							for(String var2 : parseVarMap.get(key2)){ //parseVarMap에서 key2을 찾아옴
								String findkey = var1+var2;
								ArrayList<String> ruleVar = ruleMap.get(findkey); //ruleMap에서 findkey를 찾아옴
								if(ruleVar != null && !ruleVar.isEmpty()){ //ruleVar이 비어있지않다면
									for(String var : ruleVar){
										if(!newVars.contains(var)) newVars.add(var); //newVars에 var 더해줌
									}
									parseVarMap.put(newkey, newVars); //newkey에 newVars에 있는 값 넣어줌
								}
							}
						}
						parseVarMap.put(newkey, newVars); //newkey에 newVars에 있는 값 넣어줌
					}
				}
			}
		}
		
		//최종에 S가 있는지 확인
		Integer lastkey = makeKey(1, wlen, wlen); //lastkey 생성
		boolean bAccept = false;
		for(String var : parseVarMap.get(lastkey)){
			if(var.contains("S")){ //var에 S가 포함되어있다면
				bAccept = true; 
				break;
			}
		}
		
		if(bAccept) System.out.println("Accept"); //bAccept가 true라면 Accept출력
		else System.out.println("Reject");
	}
	
	// (i, j) Key 만드는 메소드
	private static int makeKey(int i, int j, int len){
		int key = (i*len) + j;
		return key;
	}
}