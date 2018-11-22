package com.example.saeed.image_samei; //package name

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override// It is when the activity is first created
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate Run");
    }

    @Override //It is when the activity starts and becomes visible to the user.
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart Run");
    }
    /*
    It is  when the activity starts interacting with the user.
    User input takes place at this stage.
    */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume Run");
    }
    /*
    It is when the activity runs in the background
    but has not yet been killed.
    */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause Run");
    }

    @Override //It is when the activity is no longer visible to the user.
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop Run");
    }
    /*
    It is called after the activity has stopped, before starting again.
    It is normally when a user goes back to a previous activity that had been stopped.
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart Run");
    }

    @Override//This last is removed before activity from memory.
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy Run");
    }

}
