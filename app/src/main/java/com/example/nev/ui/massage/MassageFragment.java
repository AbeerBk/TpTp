package com.example.nev.ui.massage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.nev.R;


public class MassageFragment extends Fragment {

    private  MassageViewModel massageViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        massageViewModel =
                ViewModelProviders.of(this).get(MassageViewModel.class);
        View root = inflater.inflate(R.layout.fragment_massage, container, false);
        final TextView textView = root.findViewById(R.id.Edit_name);
        massageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }
}
