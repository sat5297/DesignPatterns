package AdaptorDP.MediaPlayer;

public class MediaAdaptor implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdaptor(String audioType){
        if(audioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer = new VLCPlayer();
        }
        else if(audioType.equalsIgnoreCase("MP4")){
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer.playVLC(fileName);
        }
        else if(audioType.equalsIgnoreCase("MP4")){
            advancedMediaPlayer.playMP4(fileName);
        }
        
    }
}
