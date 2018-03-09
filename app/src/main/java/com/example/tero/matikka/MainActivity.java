package com.example.tero.matikka;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    int a;
    String b;
    //Button[] buttons;
    //String buttonId;
    //for(Object nappula:R.id){}
    //System.out.log(R.id.button);
    //R.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //for (int i=0;i<R.id.all){}

        //buttons = new Button[10];
        //nappulat[0]=(Button) findViewById(R.id.button2);

        final Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setText("toimii");
            }
        });





    }
}
