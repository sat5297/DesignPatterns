package VideoStream;

public class HotStar extends StreamingService{
    private String movieName, serviceName;

    public HotStar(VideoStream videoStream, String movieName, String serviceName){
        super(videoStream);
        this.movieName = movieName;
        this.serviceName = serviceName;
    }

    public void play(){
        videoStream.streamVideo(serviceName, movieName);
    }
}
