package com.example.employeedetails;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            TextView textView = findViewById(R.id.textView);
            TextView textView1 = findViewById(R.id.textView1);
            TextView textView2 = findViewById(R.id.textView2);
            TextView textView3 = findViewById(R.id.textView3);
            String value = bundle.getString("username");
            textView.setText(value);
            String value1 = bundle.getString("address");
            textView1.setText(value1);
            String value3 = bundle.getString("age");
            textView3.setText(value3);
            String value2 = bundle.getString("gender");
            textView2.setText(value2);
        }
    }
}
