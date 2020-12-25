package 과제3장_자프실;

public class No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<100;i++) {
			int f=i/10;
			int s=i%10;
			
			if(f %3 == 0 && f !=0){
                if(f != 0 && s % 3 != 0)
                    System.out.println(i + " 박수 한 번");
                
                else if(f!=0 && s%3==0)
                    if(s!=0)
                        System.out.println(i + " 박수 두 번");
                    else
                        System.out.println(i + " 박수 한 번");       
            }         
            else if(s%3==0&&s!=0){
                if(s!=0)
                    System.out.println(i + " 박수 한 번");
            }
    
        }
        
    }
}