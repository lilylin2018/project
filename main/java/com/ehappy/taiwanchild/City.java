package com.ehappy.taiwanchild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class City extends AppCompatActivity {
    private Button draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        draw = (Button) findViewById(R.id.button);

        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(City.this , choosedraw.class);
                //開啟Activity
                startActivity(intent);
            }
        });
    }
}
