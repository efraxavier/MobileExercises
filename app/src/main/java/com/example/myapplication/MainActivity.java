package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextA, editTextB, editTextC;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        editTextC = findViewById(R.id.editTextC);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculate(View view) {
        double a = Double.parseDouble(editTextA.getText().toString());
        double b = Double.parseDouble(editTextB.getText().toString());
        double c = Double.parseDouble(editTextC.getText().toString());

        double delta = b * b - 4 * a * c;

        if (a == 0) {
            textViewResult.setText("Não é uma equação de segundo grau");
        } else if (delta < 0) {
            textViewResult.setText("Não possui raízes reais");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            textViewResult.setText(String.format("Delta: %.2f\nx1: %.2f\nx2: %.2f", delta, x1, x2));
        }
    }
}
