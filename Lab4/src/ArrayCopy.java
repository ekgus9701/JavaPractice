
public class ArrayCopy {

	public static void main(String[] args) {
		String[] oldArray= {"ewha", "computer", "java"};
		String[] newArray =new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i=0;i<newArray.length;i++)
			System.out.print(newArray[i]+", ");

	}

}
