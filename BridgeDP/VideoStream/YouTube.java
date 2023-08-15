package VideoStream;

public class YouTube extends StreamingService{
    private String movieName, serviceName;

    public YouTube(VideoStream videoStream, String movieName, String serviceName){
        super(videoStream);
        this.movieName = movieName;
        this.serviceName = serviceName;
    }

    public void play(){
        videoStream.streamVideo(serviceName, movieName);
    }
}
