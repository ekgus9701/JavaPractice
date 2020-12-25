import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CykMain {
	//��ǻ�Ͱ������� 1971055 �Ѵ���
	
	private static int ruleCnt = 0;
	private static HashMap<String, ArrayList<String>> ruleMap = new HashMap<String, ArrayList<String>>(); 
	//String Ÿ���� key���� �迭���¸鼭 StringŸ���� value ���� ������ ���� �� �ִ� ��ü ruleMap�� ����
	private static String w;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��Ģ�� ������ �Է��ϼ���=>");
		ruleCnt = sc.nextInt(); //��Ģ�� ���� �Է¹���
		sc.nextLine();
		System.out.println(ruleCnt + "���� ��Ģ�� �Է��ϼ���");
		for(int i = 0; i<ruleCnt; i++){
			String lnstr = sc.nextLine(); //��Ģ�Է�
			String[] str = lnstr.split(">"); //>�� �������� ����
			if(str.length == 2){ //���̰� 2���
				String key = str[1]; //key�� str[1]�� ����Ǿ��ִ� String ����
				ArrayList<String> lst = ruleMap.get(key.trim()); //1st�� ruleMap���� ������ key�� ����
				if(lst == null){
					lst = new ArrayList<String>();
					lst.add(str[0].trim()); //�ش� �꿡 ������ �߰�
					ruleMap.put(key, lst); //key,1st ������ �־���
				}
				else //1st�� null�� �ƴ϶��
					lst.add(str[0].trim()); //�ش� �꿡 ������ �߰�
			}
			else{ //error handle
			}
		}
		
		HashMap<Integer, ArrayList<String>> parseVarMap = new HashMap<Integer, ArrayList<String>>();
		//Integer Ÿ���� key���� �迭���¸鼭 StringŸ���� value ���� ������ ���� �� �ִ� ��ü parseVarMap�� ����
		System.out.println("\n��� Ȯ���� �ʿ��� ���ڿ��� �Է��ϼ���.");
		w = sc.nextLine().trim(); //���ڿ� �Է�
		int wlen = w.length(); //wlen�� w�Ǳ���
		
		for(int len=1; len<=wlen; len++){ //w�� substring���̸� 1���� �ϳ��� ����
			for(int i=1, j=len; j<=wlen; i++, j++){ //������ �� ���� �� �� �ְ��Ѵ�
				Integer newkey = makeKey(i,j,wlen);  // (i, j) Key ����� �޼ҵ带 ����� newkey ����
				ArrayList<String> newVars = new ArrayList<String>(); //�迭���¸鼭 String Ÿ���� ��ü newVars ����
				//V(ij)
				if(len == 1){ //��, 11 22 33 44 55...�� ���
					String findkey = w.substring(i-1, i); //�ɺ� ����
					ArrayList<String> ruleVar = ruleMap.get(findkey); //�ɺ��� ���� �ִ� ���� ã��
					if(ruleVar != null && !ruleVar.isEmpty()){ //ruleVar�� ��������ʴٸ�
						for(String var : ruleVar){ 
							newVars.add(var); //newVars�� var�� ������
						}
						parseVarMap.put(newkey, newVars); //newkey�� newVars�� �ִ°� �־���
					}
					continue;
				}
				else{ //���̰� 1�� �ƴ϶��
					for(int k=i; k<j; k++){
						Integer key1 = makeKey(i,k,wlen); //key1 ����
						Integer key2 = makeKey(k+1,j,wlen); //key2����
						//V(i,k)V(k+1,j)
						for(String var1 : parseVarMap.get(key1)){ //parseVarMap���� key1�� ã�ƿ�
							for(String var2 : parseVarMap.get(key2)){ //parseVarMap���� key2�� ã�ƿ�
								String findkey = var1+var2;
								ArrayList<String> ruleVar = ruleMap.get(findkey); //ruleMap���� findkey�� ã�ƿ�
								if(ruleVar != null && !ruleVar.isEmpty()){ //ruleVar�� ��������ʴٸ�
									for(String var : ruleVar){
										if(!newVars.contains(var)) newVars.add(var); //newVars�� var ������
									}
									parseVarMap.put(newkey, newVars); //newkey�� newVars�� �ִ� �� �־���
								}
							}
						}
						parseVarMap.put(newkey, newVars); //newkey�� newVars�� �ִ� �� �־���
					}
				}
			}
		}
		
		//������ S�� �ִ��� Ȯ��
		Integer lastkey = makeKey(1, wlen, wlen); //lastkey ����
		boolean bAccept = false;
		for(String var : parseVarMap.get(lastkey)){
			if(var.contains("S")){ //var�� S�� ���ԵǾ��ִٸ�
				bAccept = true; 
				break;
			}
		}
		
		if(bAccept) System.out.println("Accept"); //bAccept�� true��� Accept���
		else System.out.println("Reject");
	}
	
	// (i, j) Key ����� �޼ҵ�
	private static int makeKey(int i, int j, int len){
		int key = (i*len) + j;
		return key;
	}
}