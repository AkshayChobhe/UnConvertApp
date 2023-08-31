package com.example.unconvert;

//import android.annotation.SuppressLint;
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

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Spinner convertFromDropdown;
    Spinner convertToDropdown;
    EditText editTextNumber;
    TextView textView5;
    Button button;

    //declaring hash map
    private final Map<String, Double> conversionFactors = new HashMap<>();

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
        String[] dropdownlist = {"Millimetre(mm)", "Centimetre(cm)", "Decimetre(dm)", "Metre(m)", "Decametre(dcm)", "Hectometre(hm)", "Kilometre(km)"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, dropdownlist);
        convertFromDropdown.setAdapter(adapter);
        convertToDropdown.setAdapter(adapter);

    // Conversion factors map
        // Populate conversion factors map
        conversionFactors.put("Millimetre(mm)", 1.0);
        conversionFactors.put("Centimetre(cm)", 10.0);
        conversionFactors.put("Decimetre(dm)", 100.0);
        conversionFactors.put("Metre(m)", 1000.0);
        conversionFactors.put("Decametre(dcm)", 10000.0);
        conversionFactors.put("Hectometre(hm)", 100000.0);
        conversionFactors.put("Kilometre(km)", 1000000.0);
    }
    @SuppressLint("SetTextI18n")
    public void calculate(View view) {
        try {
            String selectedFromUnit = convertFromDropdown.getSelectedItem().toString();
            String selectedToUnit = convertToDropdown.getSelectedItem().toString();

            String inputText = editTextNumber.getText().toString();
            if (inputText.isEmpty()) {
                textView5.setText("Please enter a value");
                return;
            }

            double inputValue = Double.parseDouble(inputText);
            double fromFactor = conversionFactors.get(selectedFromUnit);
            double toFactor = conversionFactors.get(selectedToUnit);

            double result = inputValue * (fromFactor / toFactor);
            String resultUnit = selectedToUnit.substring(selectedToUnit.indexOf('(') + 1, selectedToUnit.indexOf(')'));

            textView5.setText(result + " " + resultUnit);
            Toast.makeText(MainActivity.this, "Converted Successfully!", Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException e) {
            textView5.setText("Invalid input");
            Toast.makeText(MainActivity.this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            textView5.setText("An error occurred");
            Toast.makeText(MainActivity.this, "An error occurred. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }

}






