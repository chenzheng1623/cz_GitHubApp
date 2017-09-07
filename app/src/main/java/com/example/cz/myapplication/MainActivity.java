package com.example.cz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    iBlending blending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //梵高传
        blending = new ImageBlendingManager();
        blending.init();
    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId){
            case 1:
                blending.createmask();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    iBlending.CallBack callback = new iBlending.CallBack() {
        @Override
        public void start() {

        }

        @Override
        public void onResult() {

        }

        @Override
        public void onError() {

        }
    };
}
