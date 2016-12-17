package org.esiea.wong_pascolo.test;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hw =(TextView)findViewById(R.id.tv_hello_world);
        Button btn_hw =(Button)findViewById(R.id.btn_hello_world);
        tv_hw.setText("lool");
    }
}
