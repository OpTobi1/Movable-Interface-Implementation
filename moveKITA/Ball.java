package moveKITA;

class Ball implements Movable {
    private int x = 0, y = 0, speed = 10;

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public Point getPosition() {
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "The ball is in position: " + getPosition() + " and his speed is " + speed;
    }
}