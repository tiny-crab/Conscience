package com.zachcrabtree.commonconscience;

import android.app.Fragment;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class actionButtonFragment extends Fragment {

    private int[] modArray = new int[]{};
    private int[] actionIntArray;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getStringArray();
        return inflater.inflate(R.layout.fragment_actionbuttons, container, false);
    }

    public void modifyVals(View view) {
        //switch case for each of six buttons
        //if button[x] is pressed, get the string out of actionArray[x]
        //then push all items of the string in actionArray[x] into modArray

        int actionToTake = 0;
        switch (view.getId()) {
            case R.id.action0:
                actionToTake = 0;
                break;
            case R.id.action1:
                actionToTake = 1;
                break;
            case R.id.action2:
                actionToTake = 2;
                break;
            case R.id.action3:
                actionToTake = 3;
                break;
            case R.id.action4:
                actionToTake = 4;
                break;
            case R.id.action5:
                actionToTake = 5;
                break;
            default:
                //throw an error?
        }

        modArray = getXMLbyIndex(actionToTake);
    }

    private void getStringArray(){
        String[] actionArray = new String[]{};
        //get all of the references necessary to fill 6 buttons
        //eventually, this will be randomly generated, and finally, habitually generated
        actionArray = getResources().getStringArray(R.array.actionList);
        actionIntArray = new int[actionArray.length];
        for (int x = 0; x < actionArray.length; x++) {
            actionIntArray[x] = x;
        }
    }

    private int[] getXMLbyIndex(int index) {
        Resources res = getResources();
        return res.getIntArray(res.getIntArray(R.array.actionList)[index - 1]);
    }

    private void shuffleArray(int[] shuffleArray)
    {
        Random shuffler = ThreadLocalRandom.current();
        for(int x = shuffleArray.length-1; x > 0; x--)
        {
            int index = shuffler.nextInt(x + 1);
            int savedNum = shuffleArray[index];
            shuffleArray[index] = shuffleArray[x];
            shuffleArray[x] = savedNum;
        }
    }
}
