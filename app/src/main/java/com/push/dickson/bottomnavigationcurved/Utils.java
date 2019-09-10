package com.push.dickson.bottomnavigationcurved;

import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class Utils {

    /**
     * Method to setup the bottom sheet behaviour.
     *
     * @param bottomSheetBehavior
     * @param overLappingView
     * @param slideUpButton
     */
    public static void setupBottomSheet(BottomSheetBehavior bottomSheetBehavior, final View overLappingView, final ImageView slideUpButton) {
        final float baseOffset = 1.0f;

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

        // set the peek height
        bottomSheetBehavior.setPeekHeight(overLappingView.getContext().getResources().getDimensionPixelSize(R.dimen.slide_up_view_header_height));

        // set hideable or not
        bottomSheetBehavior.setHideable(false);

        // set callback for changes
        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                //bottomSheetBehaviourListener.onStateChanged(newState);
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                overLappingView.setAlpha(baseOffset - slideOffset);
                if (slideOffset == 0.0) {
                    //slideUpButton.setImageResource(R.mipmap.ic_expand_less_black_24dp);
                    slideUpButton.setColorFilter(ContextCompat.getColor(overLappingView.getContext(), R.color.colorPrimary));
                    //slideUpButton.setBackgroundResource(R.drawable.slideupview_button_white);
                } else {
                    //slideUpButton.setImageResource(R.mipmap.ic_expand_more_black_24dp);
                    slideUpButton.setColorFilter(ContextCompat.getColor(overLappingView.getContext(), android.R.color.white));
                    //slideUpButton.setBackgroundResource(R.drawable.slideupview_button_orange);
                }
            }
        });
    }
}
