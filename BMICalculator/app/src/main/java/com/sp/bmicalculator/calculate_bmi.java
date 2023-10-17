package com.sp.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import java.util.*;
import java.text.DecimalFormat;

public class calculate_bmi extends AppCompatActivity {
    private EditText weight;
    private EditText height;
    private Button calculate;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_bmi);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        calculate =findViewById(R.id.button_calculate);
        calculate.setOnClickListener(onSave);

    }
    private View.OnClickListener onSave = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String weightStr = weight.getText().toString();
            double weight_val = Double.parseDouble(weightStr);
            String heightStr = height.getText().toString();
            double height_val = Double.parseDouble(heightStr);
            double BMI_val = weight_val / (height_val*height_val);
            String BMI_lvl = "";
            if (BMI_val < 18.5){
                BMI_lvl = "Underweight";
            }
            if (BMI_val >= 18.5 & BMI_val <= 24.9){
                BMI_lvl = "Healthy";
            }
            if (BMI_val >=25.0 & BMI_val <=29.9){
                BMI_lvl = "Overweight";
            }
            if (BMI_val >30.0){
                BMI_lvl = "Obese";
            }
            BMI_val = Double.parseDouble(df.format(BMI_val));
        }
    }
}