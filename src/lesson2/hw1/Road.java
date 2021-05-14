package lesson2.hw1;

public class Road implements Overcomeable {
    private int length;

    public Road(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Competitable competitable) {
        competitable.run(length);
    }
}
