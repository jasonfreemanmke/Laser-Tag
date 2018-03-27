package edu.matc.lasertagpro;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class BombActivity extends AppCompatActivity
{




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bomb);

        // How to show icon in action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        Button btnGame = (Button) findViewById(R.id.btnGenCode);
        final TextView description = (TextView) findViewById(R.id.txtBxCode);


        btnGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                description.setText("jhgdiugkejb");

            }


//            public void generate(View v)
//            {
//                Random rand = new Random();
//                int number = rand.nexInt(6)+6;
//                description.setText();
//            }


        });













    }
}
