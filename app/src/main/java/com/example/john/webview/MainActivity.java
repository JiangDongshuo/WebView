package com.example.john.webview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button openurl=(Button) findViewById(R.id.openurl);
        openurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="";
                EditText editText1=(EditText) findViewById(R.id.url);
                url=editText1.getText().toString();
                System.out.println(url);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse(url);
                intent.setData(uri);
                startActivity(intent);

            }
        });
    }
}
