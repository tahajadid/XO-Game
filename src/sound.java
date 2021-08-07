import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class sound {
	
	public static  InputStream musicB;
	public static AudioStream audiosB;
	
	public static void InitBirdMusic() {
		try {
			musicB = new FileInputStream(new File("music/sound.wav"));
			audiosB= new AudioStream(musicB);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void stopBirdMusic() {
		AudioPlayer.player.stop(audiosB);
	}
	public static void PlayMusic() {
		stopBirdMusic();
		InitBirdMusic();
		AudioPlayer.player.start(audiosB);
		 
	}

	

}
