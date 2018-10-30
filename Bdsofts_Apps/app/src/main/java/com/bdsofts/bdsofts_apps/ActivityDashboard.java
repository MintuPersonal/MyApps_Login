package com.bdsofts.bdsofts_apps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class ActivityDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dashboard );
        this.getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );

        try {
            this.getSupportActionBar().hide();
        }catch (Exception ex){
            Toast.makeText(getApplicationContext(), ""+ex, Toast.LENGTH_LONG).show();
        }
    }
}
