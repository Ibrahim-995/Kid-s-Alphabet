package com.example.asus.kidsalphabet;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class UFragment extends Fragment {

    ImageButton playButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_u, container, false);

        playButton = (ImageButton) rootView.findViewById(R.id.Ibtn21);
        final MediaPlayer sound = MediaPlayer.create(getActivity(), R.raw.umbrella);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sound.setLooping(true);
                sound.start();


            }
        });


        return rootView;
    }
}
