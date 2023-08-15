package VideoStream;

public abstract class StreamingService {
    protected VideoStream videoStream;

    protected StreamingService(VideoStream videoStream){
        this.videoStream = videoStream;
    }

    public abstract void play();
}
