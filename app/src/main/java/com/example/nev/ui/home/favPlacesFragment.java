package com.example.nev.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.nev.R;

import java.util.ArrayList;

public class favPlacesFragment extends Fragment {

    private View favPlaces_View;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

            favPlaces_View = inflater.inflate(R.layout.fragment_favplaces, container, false);


            ListView favListView = (ListView) favPlaces_View.findViewById(R.id.favList);

            ArrayList<String> favPlaces = new ArrayList<>();
            favPlaces.add("Univercity of Jeddah");
            favPlaces.add("home");
            favPlaces.add("Al baik");

            ArrayAdapter fav_Adapter = new ArrayAdapter(getContext(), R.layout.support_simple_spinner_dropdown_item, favPlaces);

            favListView.setAdapter(fav_Adapter);


            return favPlaces_View;

        }
    }

