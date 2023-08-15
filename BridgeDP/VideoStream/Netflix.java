package VideoStream;

public class Netflix extends StreamingService{
    private String movieName, serviceName;

    public Netflix(VideoStream videoStream, String movieName, String serviceName){
        super(videoStream);
        this.movieName = movieName;
        this.serviceName = serviceName;
    }

    public void play(){
        videoStream.streamVideo(serviceName, movieName);
    }
}
