package com.example.user.hw3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {
    private Button button;
    private EditText input ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        input=(EditText)findViewById(R.id.editText5);


        /// Button 跳下一頁
        //button =(Button)findViewById(R.id.button3);
        Button nextPageBtn = (Button)findViewById(R.id.button3);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_str =input.getText().toString();
                Intent intent = new Intent();
                intent.setClass(Page2.this , HW3.class);
                startActivity(intent);
                Toast toast;
                toast = Toast.makeText(Page2.this,"Hello " +input_str, Toast.LENGTH_LONG);
                //顯示Toast
                toast.show();
            }

        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
