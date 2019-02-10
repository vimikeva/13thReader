package com.thirteenth.v13threader;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeDefault extends Fragment {
    private static final int LAYOUT = R.layout.fragment_home_default;

    TextView homeContent1;
    TextView homeContent2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(LAYOUT, null);

        homeContent1 = view.findViewById(R.id.home_content_1);
        homeContent2 = view.findViewById(R.id.home_content_2);

        Typeface awesome5BrandsRegular = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/Font Awesome 5 Brands-Regular.otf");
        Typeface segoeUI = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/Segoe UI.ttf");

        homeContent1.setTypeface(awesome5BrandsRegular);
        homeContent2.setTypeface(segoeUI);

        return view;
    }

}
