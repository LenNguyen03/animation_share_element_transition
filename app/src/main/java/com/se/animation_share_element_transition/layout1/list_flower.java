package com.se.animation_share_element_transition.layout1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

import com.se.animation_share_element_transition.R;

public class list_flower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_flower);

        // we are adding fade animation, between two imageviews.
        android.transition.Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        // we are adding fade animation for enter transition.
        getWindow().setEnterTransition(fade);

        // we are also setting fade animation for exit transition.
        getWindow().setExitTransition(fade);
        // initializing our imageview.



        final ImageView imageView = findViewById(R.id.img_lavender);
        // setting on click listener for our imageview.
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(list_flower.this,
                        share_element_lavender.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                list_flower.this, imageView,
                                ViewCompat.getTransitionName(imageView));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });

        final ImageView img_lavender_light = findViewById(R.id.img_lavender_light);
        // setting on click listener for our imageview.
        img_lavender_light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(list_flower.this,
                        share_element_lavender_light.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                list_flower.this, imageView,
                                ViewCompat.getTransitionName(imageView));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });


        final ImageView img_tree = findViewById(R.id.img_tree);
        // setting on click listener for our imageview.
        img_tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(list_flower.this,
                        share_element_tree.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                list_flower.this, imageView,
                                ViewCompat.getTransitionName(imageView));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });


        final ImageView img_yellow = findViewById(R.id.img_yellow);
        // setting on click listener for our imageview.
        img_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(list_flower.this,
                        share_element_yellow.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                list_flower.this, imageView,
                                ViewCompat.getTransitionName(imageView));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });

    }
}