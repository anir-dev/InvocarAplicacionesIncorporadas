package com.example.in2dm3_14.invocaraplicacionesincorporadas;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.opengl.EGLExt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        Button b = (Button) v;

        if (b.getId() == R.id.buttonNavegador) {

            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es"));
            startActivity(i);
            //Toast.makeText(getApplicationContext(),"Toast ", Toast.LENGTH_SHORT);
        }

        if (b.getId() == R.id.buttonLlamada) {

            Intent i = new Intent(Intent.ACTION_DIAL);
            startActivity(i);
            //Toast.makeText(getApplicationContext(),"Toast ", Toast.LENGTH_SHORT);
        }

        if (b.getId() == R.id.buttonMarcarNum) {

            Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+944112233"));
            startActivity(i);
            //Toast.makeText(getApplicationContext(),"Toast ", Toast.LENGTH_SHORT);
        }

        if (b.getId() == R.id.buttonLLamar) {
            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+944112233"));
            //Toast.makeText(getApplicationContext(),"Toast ", Toast.LENGTH_SHORT);
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            startActivity(i);

        }


    }
}
