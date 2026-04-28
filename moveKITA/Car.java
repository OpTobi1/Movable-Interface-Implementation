package moveKITA;

class Car implements Movable {
    private int position = 0;

    @Override
    public void moveLeft() {
        position--;
    }

    @Override
    public void moveRight() {
        position++;
    }

    @Override
    public String toString() {
        return "The car is in position: " + position;
    }
}
