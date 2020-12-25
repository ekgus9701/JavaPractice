import java.util.Calendar;
public class eNUMwEEKeX {

	public static void main(String[] args) {
		Week today=null; //열거형 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week= cal.get(Calendar.DAY_OF_WEEK); //일(1)~토(7)까지의 숫자를 리턴
		
		switch(week) {
		
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WEDNESDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		}
		System.out.println("Today is "+today+"!");
	}

}
