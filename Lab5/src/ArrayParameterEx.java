
public class ArrayParameterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'T','h','i','s',' ', 'i','s',' ','a',' ' ,'p','e','n','c','i','l','.'};
		
		ArrayParameter.printCharArray(c);//원의 배열 원소 출력
		ArrayParameter.replaceSpace(c); //공백 문자 바꾸기
		ArrayParameter.printCharArray(c); //수정된 배열 원소 출력
	}

}
