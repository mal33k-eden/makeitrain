package uk.ac.tees.v8218996.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView updateAmount;
    private int amount = 1000;
    private NumberFormat cur = NumberFormat.getCurrencyInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateAmount = findViewById(R.id.textView2);

        updateAmount.setText(String.valueOf(cur.format(amount)));



    }

    public void increaseBalance(View v){

        amount += 1000;

        //NumberFormat format = NumberFormat.getCurrencyInstance();


        updateAmount.setText(String.valueOf(cur.format(amount)));

        //Log.d("checks", "amount is " + amount);
    }
}
