package com.example.izudinqasam.livedataexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {


    EditText editText;
    Button btn;
    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_frag1, container, false);
        btn = (Button) v.findViewById(R.id.btnKirim);
        editText = (EditText) v.findViewById(R.id.editNama);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyApplication.getInstance().getUser().setNama(
                        (editText.getText().toString() == "" ? null : editText.getText().toString()));
            }
        });
        return v;
    }

}
