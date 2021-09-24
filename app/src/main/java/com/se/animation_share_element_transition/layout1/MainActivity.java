package com.se.animation_share_element_transition.layout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.se.animation_share_element_transition.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent( MainActivity.this,
                       list_flower.class));

               overridePendingTransition(R.anim.enter_x, R.anim.exit_x);
           }

       });
    }
}