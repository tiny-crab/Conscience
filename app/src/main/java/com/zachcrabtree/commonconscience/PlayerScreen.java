package com.zachcrabtree.commonconscience;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PlayerScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_screen);
        getSupportActionBar().hide();
    }

    //  switch statement to handle button clicks
    //  six or so buttons on the screen, each one references a specific action set in an array on the
    //creation of the actionButtonFragment.
    //  the action will modify the values of energy, stress, happiness, and time

}
