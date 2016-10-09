package innovation.tower.com.axida.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import innovation.tower.com.axida.util.Global;

/**
 * Created by RnEST-A305 on 07/10/2016.
 */

public class SplashScreen extends Activity
{
        @Override //constructor
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new Handler().postDelayed(new Runnable() {

            /*
             * Nampilin Splash screen buat menampilkan logo sebentar sama loading proses
             */
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

                // close this activity
                finish();
            }
        }, Global.SPLASH_TIME_OUT);
    }
    }