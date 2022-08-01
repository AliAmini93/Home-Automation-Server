package com.example.computer_1.arminapplication.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.computer_1.arminapplication.R;

/**
 * Created by Melo on 12/22/2016.
 */
public class HistoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        TextView log=(TextView)findViewById(R.id.history_log);
        Intent i=getIntent();
        System.out.println(">>><<<<<>>>><<<>><><><><><><>"+i.getStringExtra("clientLog"));
        log.setText(i.getStringExtra("clientLog"));
    }
}
