package com.se.animation_share_element_transition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class MusicAppRecycleAdapter extends RecyclerView.Adapter<MusicAppRecycleAdapter.MusicAppRecycleHolder> {

    private LinkedList<Person> persons;
    private LayoutInflater inflater;
    private Context context;
    private Activity activity;

    public MusicAppRecycleAdapter(LinkedList<Person> persons, Context context, Activity activity) {
        this.persons = persons;
        this.context = context;
        this.activity = activity;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MusicAppRecycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycle_music_list, parent, false);
        return new MusicAppRecycleHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAppRecycleHolder holder, int position) {
        Person person = persons.get(position);
        holder.tvNamePerson.setText(person.getNamePerson());
        holder.tvNameSong.setText(person.getNameSong());
        holder.img.setImageResource(person.getImage());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class MusicAppRecycleHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        private MusicAppRecycleAdapter adapter;
        ImageView img;
        TextView tvNamePerson, tvNameSong;

        public MusicAppRecycleHolder(@NonNull View itemView, MusicAppRecycleAdapter adapter) {
            super(itemView);

            tvNamePerson = itemView.findViewById(R.id.tvNamePerson);
            tvNameSong = itemView.findViewById(R.id.tvNameSong);
            img = itemView.findViewById(R.id.img_person);

            this.adapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, MusicAppScreen1.class);
            Person person = persons.get(getLayoutPosition());

            Bundle bundle = new Bundle();
            bundle.putSerializable("person", person);
            intent.putExtra("entity", bundle);

            context.startActivity(intent);
            activity.overridePendingTransition(R.anim.enter_x, R.anim.exit_x);
        }
    }
}
