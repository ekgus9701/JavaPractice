
public class SupersonicEx {

	public static void main(String[] args) {
		Supersonic sa = new Supersonic();
		sa.takeoff();
		sa.fly();
		sa.flyMode = Supersonic.SUPERSONIC;
		sa.fly();
		sa.flyMode = Supersonic.NORMAL;
		sa.fly();
		sa.land();
	}

}
