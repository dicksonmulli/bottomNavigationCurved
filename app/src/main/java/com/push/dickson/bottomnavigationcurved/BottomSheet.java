package com.push.dickson.bottomnavigationcurved;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.annotation.Nullable;

public class BottomSheet extends BottomSheetDialogFragment {

    public static BottomSheet newInstance() {
        return new BottomSheet();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_photo_bottom_sheet, container,
                false);

        // get the views and attach the listener

        return view;

    }
}
