package moveKITA;

class Player implements Movable {
    private final String name;
    private int position = 0;

    public Player(String name) {
        this.name = name;
    }

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
        return "The player " + name + " is in position: " + position;
    }
}