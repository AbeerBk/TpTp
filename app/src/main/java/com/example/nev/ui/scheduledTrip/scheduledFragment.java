package com.example.nev.ui.scheduledTrip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.nev.R;

import java.util.ArrayList;

public class scheduledFragment extends Fragment {

private View schedule_View;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        schedule_View = inflater.inflate(R.layout.fragment_scheduledtrip, container , false);

        ListView ScheduledListView=(ListView) schedule_View.findViewById(R.id.ScheduledList);

        ArrayList<String> ScheduledListViewArrayList=new ArrayList<>();
        ScheduledListViewArrayList.add("University of Jeddah ");
        ScheduledListViewArrayList.add("red see mall");

        ArrayAdapter schedule_Adapter =new ArrayAdapter(getContext(), R.layout.support_simple_spinner_dropdown_item,ScheduledListViewArrayList);

        ScheduledListView.setAdapter(schedule_Adapter);


return schedule_View;
    }
}