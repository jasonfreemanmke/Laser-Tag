package edu.matc.lasertagpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CaptureChoose extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture_choose);

        // How to show icon in action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        Button btnGame = (Button) findViewById(R.id.btnGameInfo);


        btnGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {


                {
                    //Toast.makeText(MainActivity.this, "Welcome to Defuse the Bomb", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(CaptureChoose.this, CaptureActivity.class));
                }
            }
        });
    }
}
