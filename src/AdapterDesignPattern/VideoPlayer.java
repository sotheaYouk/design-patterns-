package AdapterDesignPattern;

public class VideoPlayer implements AdvanceMediaPlayer{

	@Override
	public void playVideo() {
		System.out.println("play video");
	}
	
}

//this class implements AdvanceMediaPlayer in order to play the video