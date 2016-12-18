package com.example.nikhilgupta.jokesactivitylibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class JokesFragment extends Fragment {

    public JokesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String joke = getActivity().getIntent().getExtras().getString("Joke");
        View v = inflater.inflate(R.layout.fragment_jokes, container, false);
        ((TextView)v.findViewById(R.id.jokeText)).setText(joke);
        return  v;
    }

}
