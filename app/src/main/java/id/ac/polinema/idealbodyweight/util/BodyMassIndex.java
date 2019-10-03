package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {

    private int weight;
    private float height;
    private float index;
    private String range;

    public BodyMassIndex(int weight, int height) {
        this.weight = weight;
        this.height = height/100.0f;
        this.index = Float.parseFloat(String.valueOf(calculate()));
        this.range = range(index);
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        return weight/ (height*height);
    }

    private String range(float index){
        if (index < 18.50f){
            return range = "Underwheight";
        }else if (index < 25.0f){
            return range = "Normal BMI";
        }else if (index < 30.0f){
            return range = "Overweight Pre-obese";
        }else if (index < 35.0f){
            return  range = "Overweight Obese class 1";
        }else if (index < 40.0f){
            return  range = "Overweight Obese class 2";
        }else {
            return  range = "Overweight Obese class 3";
        }
    }

    public String getRange(){ return range;}
}
