package com.zachcrabtree.commonconscience;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class actionButtonFragment extends Fragment {

    private String[] actionArray = new String[]{};
    private int[] modArray = new int[]{};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getStringArray();
        return inflater.inflate(R.layout.fragment_actionbuttons, container, false);
    }

    public void modifyVals(View view) {
        //switch case for each of six buttons
        //if button[x] is pressed, get the string out of actionArray[x]
        //then push all items of the string in actionArray[x] into modArray

        String actionToTake;
        switch (view.getId()) {
            case R.id.action0:
                actionToTake = actionArray[0];
                break;
            case R.id.action1:
                actionToTake = actionArray[1];
                break;
            case R.id.action2:
                actionToTake = actionArray[2];
                break;
            case R.id.action3:
                actionToTake = actionArray[3];
                break;
            case R.id.action4:
                actionToTake = actionArray[4];
                break;
            case R.id.action5:
                actionToTake = actionArray[5];
                break;
            default:
                //throw an error?
        }


    }

    private void getStringArray(){
        //get all of the strings necessary to fill 6 buttons
        //eventually, this will be randomly generated, and finally, habitually generated
        actionArray = getResources().getStringArray(R.array.actionList);
    }
}
