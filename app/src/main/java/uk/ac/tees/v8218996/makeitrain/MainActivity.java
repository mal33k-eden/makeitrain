package uk.ac.tees.v8218996.makeitrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView title;
    private TextView updateAmount;
    private int amount = 1000;
    private NumberFormat cur = NumberFormat.getCurrencyInstance();
    private View mainView;
    private int bk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.textView);
        updateAmount = findViewById(R.id.textView2);

        mainView =  findViewById(R.id.main_view);

        updateAmount.setText(cur.format(amount));



    }

    public void increaseBalance(View v){

        amount += 1000;

        //NumberFormat format = NumberFormat.getCurrencyInstance();


        updateAmount.setText(cur.format(amount));

        switch(amount){

            case 5000: //black money

                 bk = getResources().getColor(R.color.colorBlack);
                 updateView(Color.WHITE,bk);

                updateToast("Making it rain with BLACK money");

            break;
            case 10000: //yellow money
                 bk = getResources().getColor(R.color.colorYellow);
                updateView(Color.WHITE,bk);

                updateToast("You have gotten yourself some YELLOW money");

                break;

            case 15000: //pink money
                bk = getResources().getColor(R.color.colorAccent);
                updateView(Color.WHITE,bk);
                updateToast("Pinkish Money is stylish money");

                break;
            case 18000: //red money
                bk = getResources().getColor(R.color.colorRed);
                updateView(Color.WHITE,bk);

                updateToast("HA! Your EYE RED  for RED MONEY!!!");

                break;
            case 20000: //green money

                bk = getResources().getColor(R.color.colorPrimaryDark);
                updateView(Color.WHITE,bk);

                updateToast("IT ALL GREEN AT THE HIGHER SIDE.... GREEN money");

                break;

        }

    }

    public void updateView(int textColor,int backColor){

        title.setTextColor(textColor);
        updateAmount.setTextColor(textColor);
        mainView.setBackgroundColor(backColor);

    }

    public void updateToast(String msg){

        Toast.makeText(MainActivity.this,msg, Toast.LENGTH_LONG)
                .show();

    }



}
