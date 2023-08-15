package VideoStream;

public class BridgePatternDemo {
    public static void main(String[] args) {
        StreamingService prime_4K = new Prime(new Player_4K(), "NUN 2", "Prime");
        StreamingService prime_8K = new Prime(new Player_8K(),  "NUN", "Prime");
        StreamingService prime_1080P = new Prime(new Player_1080(),  "NUN", "Prime");
        
        StreamingService netflix_4K = new Netflix(new Player_4K(), "Oppenhimer", "Netflix");
        StreamingService netflix_8K = new Netflix(new Player_8K(), "Mission Impossible", "Netflix");
        StreamingService netflix_1080P = new Netflix(new Player_1080(), "Mission Impossible", "Netflix");
        

        StreamingService youtube_4K = new Netflix(new Player_4K(), "DDLJ", "YouTube");
        StreamingService youtube_8K = new Netflix(new Player_8K(), "Kuch Kuch Hota Hain", "YouTube");
        StreamingService youtube_1080P = new Netflix(new Player_1080(), "Mission Impossible", "Netflix");
        
        StreamingService hotstar_4K = new Netflix(new Player_4K(), "Rab Ne Banadi Jodi", "HotStar");
        StreamingService hotstar_8K = new Netflix(new Player_8K(), "Tumbaad", "HotStar");
        StreamingService hotstar_1080P = new Netflix(new Player_1080(), "Mission Impossible", "Netflix");
        
        prime_4K.play();
        prime_8K.play();
        prime_1080P.play();

        netflix_4K.play();
        netflix_8K.play();
        netflix_1080P.play();

        youtube_4K.play();
        youtube_8K.play();
        youtube_1080P.play();

        hotstar_4K.play();
        hotstar_8K.play();
        hotstar_1080P.play();
    }
}
