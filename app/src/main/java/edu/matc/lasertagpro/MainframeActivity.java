package edu.matc.lasertagpro;

import android.nfc.tech.NfcBarcode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.TextView;

public class MainframeActivity extends AppCompatActivity
{

    SurfaceView cameraPreview;
    TextView txtResult;
    NfcBarcode barcodeDetector;
//    CameraSource cameraSource;
    int RequestCameraPermissionID = 1001;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainframe);

        // How to show icon in action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        cameraPreview = (SurfaceView) findViewById(R.id.surfaceView);
//        txtResult = (TextView)findViewById(R.id.txtResult);

//        barcodeDetector = new NfcBarcode(this)
//                .setBarcode
    }
}
