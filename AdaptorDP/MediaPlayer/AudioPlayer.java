package AdaptorDP.MediaPlayer;

public class AudioPlayer implements MediaPlayer{
    MediaAdaptor mediaAdaptor;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("MP3")){
            System.out.println("Playing MP3 file : " + fileName);
        }        
        else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")){
            mediaAdaptor = new MediaAdaptor(audioType);
            mediaAdaptor.play(audioType, fileName);
        }
        else{
            System.out.println("Incompatible media format.");
        }
    }

}
