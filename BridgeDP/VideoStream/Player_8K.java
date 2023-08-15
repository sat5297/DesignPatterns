package VideoStream;

public class Player_8K implements VideoStream{
    public void streamVideo(String streamingService, String movieName){
        System.out.println("Playing movie " + movieName + " from Streaming Service " + streamingService + " in 8K mode.");
    }
}
