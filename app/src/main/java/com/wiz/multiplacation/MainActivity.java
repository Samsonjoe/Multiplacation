package com.wiz.multiplacation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNO1,editTextNO2;
    TextView textViewAnswer;
    Button buttonMultiply;
    int no1, no2 , answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNO1 = findViewById(R.id.editTextNO1);
        editTextNO2 = findViewById(R.id.editTextNO2);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        textViewAnswer = findViewById(R.id.textViewAnswer);



    }

    public void onMultiply(View v){

        no1 = Integer.parseInt(editTextNO1.getText().toString());
        no2 = Integer.parseInt(editTextNO2.getText().toString());

        answer = no1*(no1 * no2) + no2 ;
        textViewAnswer.setText(toString().valueOf(answer));
    }
}
