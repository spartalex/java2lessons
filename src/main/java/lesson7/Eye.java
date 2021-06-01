package lesson7;

public class Eye {
    private String eyeColor;

    public Eye(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Eye() {
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Eye{" +
                "eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
