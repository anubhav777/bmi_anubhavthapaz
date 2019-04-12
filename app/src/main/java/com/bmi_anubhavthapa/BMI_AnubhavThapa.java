package com.bmi_anubhavthapa;

class BMI_AnubhavThapa {
    private float height, weight;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float CalculateBMI(){
        return weight/(height*height);
    }
}
