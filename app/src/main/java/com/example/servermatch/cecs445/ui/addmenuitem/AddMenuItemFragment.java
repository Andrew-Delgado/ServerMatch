package com.example.servermatch.cecs445.ui.addmenuitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.servermatch.cecs445.R;

public class AddMenuItemFragment extends Fragment {

    private AddMenuItemViewModel addMenuItemViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addMenuItemViewModel =
                ViewModelProviders.of(this).get(AddMenuItemViewModel.class);
        View root = inflater.inflate(R.layout.fragment_add_menu_item, container, false);
        final TextView textView = root.findViewById(R.id.text_add_menu_item);
        addMenuItemViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}