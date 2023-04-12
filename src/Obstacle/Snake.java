package Obstacle;

public class Snake extends Obstacle{

    public Snake() {
        super(4, "Snake", (int)(Math.random()*3)+3, 12, 0);
    }
}
