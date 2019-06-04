
public final class HomeTheaterFacade {
	
	private static final HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
//	Amplifier amp;
//	Tuner tuner;
//	DvdPlayer dvd;
//	CdPlayer cd;
//	Projector projector;
//	TheaterLights lights;
//	Screen screen;
//	PopcornPopper popper;
	
	private HomeTheaterFacade(){
		System.err.println("HomeTheaterFacade object created.");
	}
	
	public static HomeTheaterFacade getInstance(){
		return homeTheaterFacade;
	}
	
	public void watchMovie(String movie){
		System.out.println("Get ready to watch a movie...");
		
	}
}
