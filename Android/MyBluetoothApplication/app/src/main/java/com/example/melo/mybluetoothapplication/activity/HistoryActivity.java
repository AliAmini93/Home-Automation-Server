package com.example.melo.mybluetoothapplication.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.melo.mybluetoothapplication.R;

/**
 * Created by Melo on 12/22/2016.
 */
public class HistoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        TextView log=(TextView)findViewById(R.id.history_log);
        Intent i=getIntent();
        log.setText(i.getStringExtra("clientLog"));
    }
}
