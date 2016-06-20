package com.example.home.labtest1setc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText productPriceET;
    EditText vatET;
    EditText discountET;
    EditText finalPriceET;

    Button calculateBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

    }


    public void initialize() {

        productPriceET = (EditText) findViewById(R.id.productPriceViewET);
        vatET = (EditText) findViewById(R.id.vatViewET);
        discountET = (EditText) findViewById(R.id.discountViewET);

        calculateBT = (Button) findViewById(R.id.calculateViewBT);

        finalPriceET = (EditText) findViewById(R.id.finalPriceViewET);

    }

    public void calculate(View view) {

        double productPrice = Double.parseDouble(productPriceET.getText().toString());
        float vat = Float.parseFloat(vatET.getText().toString());
        float discount = Float.parseFloat(discountET.getText().toString());

        CalculateFinalPrice finalPriceCalculator = new CalculateFinalPrice();

        finalPriceCalculator.setProductPrice(productPrice);
        finalPriceCalculator.setVat(vat);
        finalPriceCalculator.setDiscount(discount);


        finalPriceET.setText(String.valueOf(finalPriceCalculator.finalPriceCalculation()));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
