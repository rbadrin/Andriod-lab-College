package com.example.employeedetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText edittext1;
    EditText edittext3;
    EditText edittext4;
    EditText edittext5;
    EditText edittext6;
    RadioButton radioButton;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext3 = (EditText) findViewById(R.id.editText3);
        edittext4 = (EditText) findViewById(R.id.editText4);
        edittext5 = (EditText) findViewById(R.id.editText5);
        edittext6 = (EditText) findViewById(R.id.editText6);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edittext1.getText().toString();
                String address = edittext3.getText().toString() + "  " + edittext4.getText().toString() + " " + edittext5.getText().toString();
                String age = edittext6.getText().toString();
                radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
                radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                String gender = radioButton.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("address", address);
                intent.putExtra("age", age);
                intent.putExtra("gender", gender);
                startActivity(intent);

            }
        });

    }
}