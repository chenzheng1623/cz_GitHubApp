package com.example.cz.myapplication;

/**
 * Created by cz on 17-9-2.
 */

public interface iBlending {
    void init();
    void createmask();
    void updatemask();
    void doblending();
    void unint();

    interface CallBack{
        void start();
        void onResult();
        void onError();
    }
}
