package AdapterDesignPattern;

public class MusicPlayer implements MediaPlayer{

	@Override
	public void playMusic(String audioType) {
		if(audioType.equalsIgnoreCase("mp3"))
			System.out.println("play the audio");
		
		//play video format 
		else if (audioType.equalsIgnoreCase("mp4"))
		{
			MediaPlayerAdapter playeradapter = new MediaPlayerAdapter();
			playeradapter.playMusic(audioType);
		}
		
		else 
			System.out.println("invalid format");
	}
	
	

}
