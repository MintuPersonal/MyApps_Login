package com.bdsofts.bdsofts_apps;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle( "Main Bdsofts" );

        Button aDashboard = findViewById( R.id.btnDashboard );
        aDashboard.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( ActivityMain.this, ActivityDashboard.class ) );
            }
        } );

        Button aBtn = findViewById( R.id.btnGo );
        aBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( ActivityMain.this, ActivityRegister.class ) );
            }
        } );

        Button aLilypad = findViewById( R.id.btnLilypad );
        aLilypad.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( ActivityMain.this, ActivityLilypad.class ) );
            }
        } );
    }
}
