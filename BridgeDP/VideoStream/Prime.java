package VideoStream;

public class Prime extends StreamingService{
    private String movieName, serviceName;

    public Prime(VideoStream videoStream, String movieName, String serviceName){
        super(videoStream);
        this.movieName = movieName;
        this.serviceName = serviceName;
    }

    public void play(){
        videoStream.streamVideo(serviceName, movieName);
    }
}
