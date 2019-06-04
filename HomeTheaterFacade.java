
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
// 		popper.on();
// 		popper.pop();
// 		lights.dim(10);
// 		screen.down();
// 		projector.on();
// 		projector.wideScreenMode();
// 		amp.on();
// 		amp.setSurroundSound();
// 		amp.setVolume(5);
// 		dvd.on();
// 		dvd.play(movie);
	}
}
