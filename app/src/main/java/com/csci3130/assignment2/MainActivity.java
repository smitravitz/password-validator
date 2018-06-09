package com.csci3130.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pw_strength;
    EditText editText;
    Button submit_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit_button = findViewById(R.id.submit);
        submit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                editText = findViewById(R.id.pwInput);
                pw_strength = findViewById(R.id.validation_rating);
                String pw = editText.getText().toString();
                pw_strength.setText(Validator.validate_rating(Validator.validate(pw)));
            }
        });
    }
}
