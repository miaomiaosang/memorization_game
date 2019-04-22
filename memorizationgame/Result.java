package com.mms.memorizationgame;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;



public class Result extends Fragment {




    public Result() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_result, container, false);






        Bundle b=getArguments();
        if (b.getString("Data").equals("win")){

            ((TextView)rootView.findViewById(R.id.status)).setText("You Win");
            ((TextView) rootView.findViewById(R.id.time)).setText("Time : "+b.get("Time").toString());


        }
        else{
            ((TextView)rootView.findViewById(R.id.status)).setText("Sorry, you lose.");
            ((TextView) rootView.findViewById(R.id.time)).setText("Time : "+b.get("Time").toString());

        }
        return rootView;
    }

}
