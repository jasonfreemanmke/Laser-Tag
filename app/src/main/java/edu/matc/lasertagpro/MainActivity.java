package edu.matc.lasertagpro;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static edu.matc.lasertagpro.R.string.txtBomb;
import static edu.matc.lasertagpro.R.string.txtCapture;
import static edu.matc.lasertagpro.R.string.txtMainframe;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // How to show icon in action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final TextView description=(TextView) findViewById(R.id.txtBxDecrip);
        final RadioButton btnBomb = (RadioButton) findViewById(R.id.btnBomb);
        final RadioButton btnCapture = (RadioButton) findViewById(R.id.btnCapture);
        final RadioButton btnMainframe = (RadioButton) findViewById(R.id.btnMainframe);
        Button btnGame = (Button) findViewById(R.id.btnGame);


        final RadioGroup rg1 = (RadioGroup) findViewById(R.id.radbtnGame);



        btnGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {



                if(btnBomb.isChecked())
                {

                    {

                        startActivity(new Intent(MainActivity.this, BombActivity.class));
                    }
                }
                else if (btnCapture.isChecked())
                {

                    {
                       // Toast.makeText(MainActivity.this, "Welcome to Capture the Flag", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(MainActivity.this, CaptureChoose.class));
                    }
                }
                else  if (btnMainframe.isChecked())
                {
                    {
                        Toast.makeText(MainActivity.this, "Welcome to MainFrame", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(MainActivity.this, MainframeActivity.class));
                    }
                }
                else;
                {

                }



            }
        });


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.btnBomb:
                        description.setText(txtBomb);
                        break;

                    case R.id.btnCapture:
                        description.setText(txtCapture);
                        break;

                    case R.id.btnMainframe:
                        description.setText(txtMainframe);
                        break;

                }

            }
        });
    }

}
