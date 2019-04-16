package com.example.button_counter_gravelle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private LinearLayout myLayout;
    private int count;
    private TextView counterDisplay;
    private Button addOne;
    private Button subOne;
    private Button resetAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myLayout = (LinearLayout) findViewById (R.id.mainLayout);
        counterDisplay = (TextView) findViewById (R.id.Count);
        addOne = (Button) findViewById (R.id.plus);
        subOne = (Button) findViewById (R.id.minus);
        resetAll = (Button) findViewById (R.id.reset);

        addOne.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                count++;
                counterDisplay.setText (Integer.toString (count));
            }
        });

        subOne.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                count--;
                counterDisplay.setText (Integer.toString (count));
            }
        });

        resetAll.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                count = 0;
                counterDisplay.setText (Integer.toString (count));
            }
        });


    }
}