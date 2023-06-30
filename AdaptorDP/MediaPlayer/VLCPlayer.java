package AdaptorDP.MediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer{
    
    @Override
    public void playVLC(String fileName){
        System.out.println("Playing VLC Filename : " + fileName);
    }

    @Override
    public void playMP4(String fileName){
        
    }
}
