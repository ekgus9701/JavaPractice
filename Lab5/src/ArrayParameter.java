
public class ArrayParameter {
	//메소드
	static void replaceSpace(char a[]) {
		for(int i=0;i<a.length;i++)
			if(a[i]==' ')
				a[i]=','; //공백문자를 ','로 변경
	}
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]); //배열원소 문자 출력
		System.out.println(); //배열 원소 모두 출력 후 줄바꿈
	}
}
