package com.example.nev.ui.slideshow;

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

public class promotionsFragment extends Fragment {

    private View pro_View;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pro_View = inflater.inflate(R.layout.fragment_promotions, container , false);



        ListView proListView=(ListView) pro_View.findViewById(R.id.proList);

        ArrayList<String> proArrayList=new ArrayList<>();
        proArrayList.add("50 SAR apple gift card  200 pt");
        proArrayList.add("1 Liter of fule 40 pt");
        proArrayList.add("Flight ticket to dubai 600 pt");

        ArrayAdapter pro_Adapter =new ArrayAdapter(getContext(), R.layout.support_simple_spinner_dropdown_item,proArrayList);

        proListView.setAdapter(pro_Adapter);


        return pro_View;
    }
}