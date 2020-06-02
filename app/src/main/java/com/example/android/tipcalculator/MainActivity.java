package com.example.android.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.NumberFormat;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //declare global variables

    private EditText amount;
    private EditText taxPercentage;
    private EditText tipPercentage;
    private Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize all the variables
        amount = (EditText) findViewById(R.id.amount);
        taxPercentage = (EditText) findViewById(R.id.tax_percentage);
        tipPercentage = (EditText) findViewById(R.id.tip_percentage);
        submitButton = (Button) findViewById(R.id.submit_button);
        //attach the listener to the button view and create object instance of event listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //define the event listener inline
                submit();
            }
        });
    }

    /**
     * This method is to combine all the input text and launch the second activity
     * This method will be called when the submit button being clicked
     */
    public void submit() {
        double amountValue = Double.valueOf(amount.getText().toString());
        double taxPercentageValue = Double.valueOf(taxPercentage.getText().toString());
        double tipPercentageValue = Double.valueOf(tipPercentage.getText().toString());
        //calculations

        double salesTax = amountValue * taxPercentageValue;
        double tipValue = amountValue * tipPercentageValue;
        double grandTotal = amountValue + salesTax + tipValue;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Tip tip = new Tip(nf.format(amountValue),nf.format(salesTax),nf.format(tipValue),nf.format(grandTotal));
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.TIP_INFO_KEY, tip);
        startActivity(intent);
    }
}
