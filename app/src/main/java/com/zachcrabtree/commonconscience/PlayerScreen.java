package com.zachcrabtree.commonconscience;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PlayerScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_screen);

        SharedPreferences savedData = getSharedPreferences("characterData", Context.MODE_PRIVATE);

        TextView test = (TextView) findViewById(R.id.test);
        test.setText(savedData.getString("charName", "defaultvalue") + " " + savedData.getInt("charPhys", 0));
    }
}
