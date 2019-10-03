package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {

    private int weight;
    private float height;
    private float index;

    public BodyMassIndex(int weight, int height) {
        this.weight = weight;
        this.height = height/100.0f;
        this.index = Float.parseFloat(String.valueOf(calculate()));
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        return weight/ (height*height);
    }
}
