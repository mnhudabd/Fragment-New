package com.theallasia.nhuda.salestarget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Dashboard extends Fragment {
    private static final String TAG = "fragment_dasboard";

    private Button btnNavFrag1;
    private Button btnNavFrag2;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);
        Log.d(TAG, "onCreateView: started.");

        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Dashboard", Toast.LENGTH_SHORT).show();
                //Navigate to another fragment.
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Target", Toast.LENGTH_SHORT).show();
                //Navigate to another fragment.
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        return view;
    }


}
