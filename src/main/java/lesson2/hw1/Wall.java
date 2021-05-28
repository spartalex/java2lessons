package lesson2.hw1;

public class Wall implements Overcomeable {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Competitable competitable) {
        competitable.jump(height);
    }
}
