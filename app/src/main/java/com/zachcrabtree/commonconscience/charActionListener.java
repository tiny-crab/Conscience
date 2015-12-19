package com.zachcrabtree.commonconscience;

import android.view.View;

public class charActionListener implements View.OnClickListener {

    //an action that the button represents
    private charAction triggeredAction;

    //passing intended action to change energy, stress, etc.
    public void charActionListener(charAction action)
    {
        this.triggeredAction = action;
    }

    @Override
    public void onClick(View view) {

    }
}
