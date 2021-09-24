package com.se.animation_share_element_transition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicAppScreen1 extends AppCompatActivity {

    ImageView img_taylor, img_music;
    TextView tv_name_song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_app_screen1);


        img_taylor = findViewById(R.id.img_taylor);
        tv_name_song = findViewById(R.id.tv_name_song);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("entity");
        Person persons = (Person) bundle.getSerializable("person");
        tv_name_song.setText(persons.getNamePerson() + "-" + persons.getNameSong());
        img_taylor.setImageResource(persons.getImage());

//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anirotate);
//        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aniblink);

//        img_taylor.startAnimation(animation);
//        img_music.startAnimation(animation1);

    }
}