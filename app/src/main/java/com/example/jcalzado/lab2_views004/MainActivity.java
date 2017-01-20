package com.example.jcalzado.lab2_views004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText inText1, inText2;
    private TextView outText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] operations = {"Sumar","Restar","Multiplicar","Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, operations);
        spinner.setAdapter(adapter);

        inText1 = (EditText) findViewById(R.id.editText1);
        inText2 = (EditText) findViewById(R.id.editText2);
        outText = (TextView) findViewById(R.id.textView1);
    }

    public void operar (View v) {
        int number1 = Integer.parseInt(inText1.getText().toString());
        int number2 = Integer.parseInt(inText2.getText().toString());
        String selectedItem = spinner.getSelectedItem().toString();
        if (selectedItem.equals("Sumar")) {
            outText.setText(String.valueOf(number1 + number2));
        } else if (selectedItem.equals("Restar")) {
            outText.setText(String.valueOf(number1 - number2));
        } else if (selectedItem.equals("Multiplicar")) {
            outText.setText(String.valueOf(number1 * number2));
        } else {
            outText.setText(String.valueOf(number1 / number2));
        }
    }
}
