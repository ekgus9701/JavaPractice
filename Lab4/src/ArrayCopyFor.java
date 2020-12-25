
public class ArrayCopyFor {

	public static void main(String[] args) {
		int[] oldArray = {1,2,3,4};
		int[] newArray = new int[4];
		
		for(int i=0;i<oldArray.length;i++) {
			newArray[i]=oldArray[i];
		}
		
		for(int i=0; i<newArray.length;i++)
			System.out.print(newArray[i]+" "); //배열 모든 원소 출력
	}

}
