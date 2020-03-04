package com.example.android.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView displayMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Your Receipt");
        displayMessage = (TextView) findViewById(R.id.message_display_view);
        Intent receiveIntent = getIntent();
        Tip student = (Tip) receiveIntent.getSerializableExtra(Keys.TIP_INFO_KEY);
        displayMessage.setText(student.toString());
    }
}
