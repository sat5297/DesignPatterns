package VideoStream;

public class Player_1080 implements VideoStream{
    public void streamVideo(String streamingService, String movieName){
        System.out.println("Playing movie " + movieName + " from Streaming Service " + streamingService + " in 1080P mode.");
    }
}
