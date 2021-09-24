package com.se.animation_share_element_transition.layout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.se.animation_share_element_transition.R;

public class share_element_lavender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_element_lavender);

        findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                startActivity(new Intent(share_element_lavender.this,
                        list_flower.class));
            }

        });



    }
//    @Override
//    public void onBackPressed()
//    {
//        super.onBackPressed();
//        startActivity(new Intent(share_element_lavender.this, list_flower.class));
//        finish();
//
//    }

//
//    @Override
//    public void onBackPressed() {
//        moveTaskToBack(true);
//    }
//

}