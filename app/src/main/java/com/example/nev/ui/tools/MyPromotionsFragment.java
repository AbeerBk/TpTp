package com.example.nev.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.nev.R;
import java.util.ArrayList;

public class MyPromotionsFragment extends Fragment {

    private View myPro_View;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myPro_View = inflater.inflate(R.layout.fragment_my_promotions, container , false);



        ListView myProListView=(ListView) myPro_View.findViewById(R.id.myProList);

        ArrayList<String> myProArrayList=new ArrayList<>();
        myProArrayList.add("50 SAR apple gift card  200 pt");
        myProArrayList.add("1 Liter of fule 40 pt");


        ArrayAdapter myPro_Adapter =new ArrayAdapter(getContext(), R.layout.support_simple_spinner_dropdown_item,myProArrayList);

        myProListView.setAdapter(myPro_Adapter);


        return myPro_View;
    }
}