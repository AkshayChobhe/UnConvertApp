package com.example.unconvert;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Spinner convertFromDropdown;
    Spinner convertToDropdown;
    EditText editTextNumber;
    TextView textView5;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialisation
        editTextNumber = findViewById(R.id.editTextNumber);
        textView5 = findViewById(R.id.textView5);
        button = findViewById(R.id.button);
        convertFromDropdown = findViewById(R.id.convert_from);
        convertToDropdown = findViewById(R.id.convert_to);

        //Adding functionality
        String[] dropdownlist = {"Millimetre(mm)","Centimetre(cm)","Decimetre(dm)","Metre(m)","Decametre(dcm)","Hectometre(hm)","Kilometre(km)"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, dropdownlist);
        convertFromDropdown.setAdapter(adapter);
        convertToDropdown.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
            public void onClick(View view) {
//              Decimetres Conversion
                if(convertFromDropdown.getSelectedItem().equals("Decimetre(dm)"))
                {
                    if(convertToDropdown.getSelectedItem().equals("Decimetre(dm)"))
                    {
                        textView5.setText("Please ,Select Correct Option!!!");
                    }

                    else if(convertToDropdown.getSelectedItem().equals("Centimetre(cm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10;
                        textView5.setText(result +" Centimetres(cm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Millimetre(mm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*100;
                        textView5.setText(result +" Millimetres(mm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Metre(m)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10;
                        textView5.setText(result +" Metres(m)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Decametre(dcm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/100;
                        textView5.setText(result +" Decametres(dcm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Hectometre(hm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/1000;
                        textView5.setText(result +" Hectometres(hm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Kilometre(km)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10000;
                        textView5.setText(result +" Kilometres(km)");
                    }
                }
//              Centimetres Conversion
                else if(convertFromDropdown.getSelectedItem().equals("Centimetre(cm)"))
                {
                    if(convertToDropdown.getSelectedItem().equals("Decimetre(dm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10;
                        textView5.setText(result+" Decimetres(dm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Centimetre(cm)"))
                    {
                        textView5.setText("Please ,Select Correct Option!!!");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Millimetre(mm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10;
                        textView5.setText(result +" Millimetres(mm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Metre(m)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/100;
                        textView5.setText(result +" Metres(m)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Decametre(dcm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/1000;
                        textView5.setText(result +" Decametres(dcm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Hectometre(hm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10000;
                        textView5.setText(result +" Hectometres(hm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Kilometre(km)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/100000;
                        textView5.setText(result +" Kilometres(km)");
                    }
                }
//                Millimetre Conversion
                else if(convertFromDropdown.getSelectedItem().equals("Millimetre(mm)"))
                {
                    if(convertToDropdown.getSelectedItem().equals("Decimetre(dm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/100;
                        textView5.setText(result+" Decimetres(dm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Centimetre(cm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10;
                        textView5.setText(result+" Centimetres(cm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Millimetre(mm)"))
                    {
                        textView5.setText("Please ,Select Correct Option!!!");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Metre(m)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/1000;
                        textView5.setText(result +" Metres(m)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Decametre(dcm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10000;
                        textView5.setText(result +" Decametres(dcm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Hectometre(hm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/100000;
                        textView5.setText(result +" Hectometres(hm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Kilometre(km)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/1000000;
                        textView5.setText(result +" Kilometres(km)");
                    }
                }
//                Metre Conversions
                else if(convertFromDropdown.getSelectedItem().equals("Metre(m)"))
                {
                    if(convertToDropdown.getSelectedItem().equals("Decimetre(dm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10;
                        textView5.setText(result+" Decimetres(dm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Centimetre(cm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*100;
                        textView5.setText(result+" Centimetres(cm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Millimetre(mm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*1000;
                        textView5.setText(result +" Millimetres(mm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Metre(m)"))
                    {
                        textView5.setText("Please ,Select Correct Option!!!");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Decametre(dcm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10;
                        textView5.setText(result +" Decametres(dcm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Hectometre(hm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/100;
                        textView5.setText(result +" Hectometres(hm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Kilometre(km)"))
                    {
                       double result = Double.parseDouble(editTextNumber.getText().toString())/1000;
                        textView5.setText(result +" Kilometres(km)");
                    }
                }
//                Decametre Conversions
                else if(convertFromDropdown.getSelectedItem().equals("Decametre(dcm)"))
                {
                    if(convertToDropdown.getSelectedItem().equals("Decimetre(dm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*100;
                        textView5.setText(result+" Decimetres(dm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Centimetre(cm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*1000;
                        textView5.setText(result+" Centimetres(cm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Millimetre(mm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10000;
                        textView5.setText(result +" Millimetres(mm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Metre(m)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10;
                        textView5.setText(result+" Metres(m)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Decametre(dcm)"))
                    {
                        textView5.setText("Please ,Select Correct Option!!!");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Hectometre(hm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10;
                        textView5.setText(result +" Hectometres(hm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Kilometre(km)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/100;
                        textView5.setText(result +" Kilometres(km)");
                    }
                }
//                Hectometre Conversions
                else if(convertFromDropdown.getSelectedItem().equals("Hectometre(hm)"))
                {
                    if(convertToDropdown.getSelectedItem().equals("Decimetre(dm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*1000;
                        textView5.setText(result+" Decimetres(dm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Centimetre(cm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10000;
                        textView5.setText(result+" Centimetres(cm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Millimetre(mm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*100000;
                        textView5.setText(result +" Millimetres(mm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Metre(m)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*100;
                        textView5.setText(result+" Metres(m)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Decametre(dcm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10;
                        textView5.setText(result+" Decametres(dcm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Hectometre(hm)"))
                    {
                        textView5.setText("Please ,Select Correct Option!!!");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Kilometre(km)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())/10;
                        textView5.setText(result +" Kilometres(km)");
                    }
                }
//                Kilometre Conversions
                else if(convertFromDropdown.getSelectedItem().equals("Kilometre(km)"))
                {
                    if(convertToDropdown.getSelectedItem().equals("Decimetre(dm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10000;
                        textView5.setText(result+" Decimetres(dm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Centimetre(cm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*100000;
                        textView5.setText(result+" Centimetres(cm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Millimetre(mm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*1000000;
                        textView5.setText(result +" Millimetres(mm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Metre(m)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*1000;
                        textView5.setText(result+" Metres(m)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Decametre(dcm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*100;
                        textView5.setText(result+" Decametres(dcm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Hectometre(hm)"))
                    {
                        double result = Double.parseDouble(editTextNumber.getText().toString())*10;
                        textView5.setText(result +" Hectometres(hm)");
                    }
                    else if(convertToDropdown.getSelectedItem().equals("Kilometre(km)"))
                    {
                        textView5.setText("Please ,Select Correct Option!!!");
                    }
                }
            Toast.makeText(MainActivity.this,"Converted Successfully!!!!", Toast.LENGTH_SHORT).show();
            }

        });

    }
}






