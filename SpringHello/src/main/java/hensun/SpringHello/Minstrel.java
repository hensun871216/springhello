package hensun.SpringHello;


public class Minstrel {
//	private static final Logger Song = Logger.getLogger(Minstrel.class);
	
	public void songBefore(GreetingService app) {
		System.out.println("here........");
//		Song.info("Fa la la , this is before");
	}
	
	public void songafter(GreetingService app) {
		System.out.println("end........");
//		Song.info("Fa la la , this is after");
	}
}
