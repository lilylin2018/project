package com.ehappy.taiwanchild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choosedraw extends AppCompatActivity {
    private Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosedraw);
        go = (Button) findViewById(R.id.choosepic);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(choosedraw.this , choosedetail.class);
                //開啟Activity
                startActivity(intent);
            }
        });

    }
}
