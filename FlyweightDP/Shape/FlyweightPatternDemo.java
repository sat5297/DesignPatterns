package Shape;

public class FlyweightPatternDemo extends Thread{
    private static final String colors[] = {"Red","Green","Blue","Yellow","Orange"};
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(i);
            circle.setY(i);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
}
