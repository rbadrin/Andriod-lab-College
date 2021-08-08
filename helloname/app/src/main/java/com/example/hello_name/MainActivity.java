package com.example.hello_name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edittext1;
    TextView viewtext2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1  =  (EditText) findViewById(R.id.edittext1);
        viewtext2  =  (TextView) findViewById(R.id.viewtext2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = "Hello";
                String val2 = edittext1.getText().toString();
                viewtext2.setText(val1 + "  " + val2);
            }
        });

    }

}