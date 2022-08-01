package com.example.computer_1.arminapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.computer_1.arminapplication.Const;
import com.example.computer_1.arminapplication.R;

/**
 * Created by Melo on 12/22/2016.
 */
public class ClientNumActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_num);
        ImageButton verify=(ImageButton) findViewById(R.id.verify_client);
        final TextView num=(TextView) findViewById(R.id.num_of_clients);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Const.numOfClients= Integer.parseInt(num.getText().toString());
                Intent i=new Intent(getApplicationContext(),DeviceControlActivity.class);
                startActivity(i);
            }
        });
    }
}
