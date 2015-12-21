package com.zachcrabtree.commonconscience;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zakcrabtree on 12/21/15.
 */
public class actionButtonFragment extends Fragment {

    private String[] actionArray = new String[]{};

    public void onCreate()
    {
        //get all of the strings necessary to fill 6 buttons
        //eventually, this will be randomly generated, and finally, habitually generated
        actionArray = getResources().getStringArray(R.array.actionList);
        //populate buttons with resources

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_actionbuttons, container, false);
    }

    public void modifyVals(View view) {
        
    }
}
