package com.example.wallet_test;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            //getExternalFilesDir() -> 이 앱을 삭제하면 이 메소드를 사용하여 저장한 모든 파일이 사라짐
//            Os.setenv("EXTERNAL_STORAGE", getExternalFilesDir(null).getAbsolutePath(), true);
            String test=getExternalFilesDir(null).getAbsolutePath();
            Log.d("test : ",test);
            System.loadLibrary("indy");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
