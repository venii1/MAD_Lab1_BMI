package com.sp.bmicalculator;

public class Person_BMI {
    private double height_val = 0.0;
    private double weight_val = 0.0;
    private double bmi_val = 0.0;
    private String bmi_lvl = "";

    public void setHeight_val(double height_val) {
        this.height_val = height_val;
    }

    public void setWeight_val(double weight_val) {
        this.weight_val = weight_val;
    }

    public void setBmi_val(double bmi_val) {
        this.bmi_val = bmi_val;
    }

    public String getBmi_lvl() {
        return bmi_lvl;
    }

    public void setBmi_lvl(String bmi_lvl) {
        this.bmi_lvl = bmi_lvl;
    }
}
