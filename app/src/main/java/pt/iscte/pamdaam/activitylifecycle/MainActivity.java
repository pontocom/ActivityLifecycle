package pt.iscte.pamdaam.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("APP", "ONCREATE");
    }

    // demonstrar os overrides no código

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APP", "ONSTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APP", "ONRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APP", "ONPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APP", "ONSTOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APP", "ONDESTROY");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APP", "ONRESTART");
    }

}
