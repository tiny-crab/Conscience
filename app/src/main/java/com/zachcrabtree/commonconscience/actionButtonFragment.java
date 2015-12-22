package com.zachcrabtree.commonconscience;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Random;

public class actionButtonFragment extends Fragment {

    private int[] modArray = new int[]{};
    private int[] actionIntArray;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActionArray();
        return inflater.inflate(R.layout.fragment_actionbuttons, container, false);
    }

    public void modifyVals(View view) {
        //switch case for each of six buttons
        //if button[x] is pressed, get the string out of actionArray[x]
        //then push all items of the string in actionArray[x] into modArray

        int actionToTake = 0;
        switch (view.getId()) {
            case R.id.action0:
                actionToTake = actionIntArray[0];
                break;
            case R.id.action1:
                actionToTake = actionIntArray[1];
                break;
            case R.id.action2:
                actionToTake = actionIntArray[2];
                break;
            case R.id.action3:
                actionToTake = actionIntArray[3];
                break;
            case R.id.action4:
                actionToTake = actionIntArray[4];
                break;
            case R.id.action5:
                actionToTake = actionIntArray[5];
                break;
            default:
                //throw an error?
        }
        modArray = getXMLbyIndex(actionToTake);

        TextView stressVal = (TextView) getView().findViewById(R.id.stressVal);
        TextView energyVal = (TextView) getView().findViewById(R.id.energyVal);
        TextView happyVal = (TextView) getView().findViewById(R.id.happyVal);

        System.out.println(modArray.toString());
    }

    private void getActionArray(){
        String[] actionArray = new String[]{};
        //get all of the references necessary to fill 6 buttons
        //eventually, this will be randomly generated, and finally, habitually generated
        actionArray = getResources().getStringArray(R.array.actionList);
        //this int array will have
        actionIntArray = new int[actionArray.length];
        for (int x = 0; x < actionArray.length; x++) {
            actionIntArray[x] = x + 1;
        }
        shuffleArray(actionIntArray);
    }

    private int[] getXMLbyIndex(int index) {
        Resources res = getResources();
        return res.getIntArray(res.getIntArray(R.array.actionList)[index - 1]);
    }

    private void shuffleArray(int[] shuffleArray)
    {
        Random shuffler = new Random();
        for(int x = shuffleArray.length-1; x > 0; x--)
        {
            int index = shuffler.nextInt(x + 1);
            int savedNum = shuffleArray[index];
            shuffleArray[index] = shuffleArray[x];
            shuffleArray[x] = savedNum;
        }
    }
}
