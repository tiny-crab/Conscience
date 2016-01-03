package com.zachcrabtree.commonconscience;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_screen);
        getSupportActionBar().hide();

        //storing references to the values to manipulate later
        TextView energyValue = (TextView) findViewById(R.id.energyVal);
        TextView stressValue = (TextView) findViewById(R.id.stressVal);
        TextView happyValue = (TextView) findViewById(R.id.happyVal);

        energyValue.setText("100");
        stressValue.setText("100");
        happyValue.setText("100");
        colorText(energyValue);
        colorText(stressValue);
        colorText(happyValue);
    }

    private void colorText(TextView targetView) {
        //gets the energy, stress, or happiness value as a number
        int value = Integer.parseInt(targetView.getText().toString());
        if(value == 100) {
            targetView.setTextColor(Color.GREEN);
        }
        if(value < 100 && value >= 50) {
            targetView.setTextColor(Color.YELLOW);
        }
        if(value < 50 && value >= 0) {
            targetView.setTextColor(Color.RED);
        }
    }

    public void onClick(View view) {
        //storing references to the values to manipulate later
        TextView energyValue = (TextView) findViewById(R.id.energyVal);
        TextView stressValue = (TextView) findViewById(R.id.stressVal);
        TextView happyValue = (TextView) findViewById(R.id.happyVal);

        String[] testArray = getResources().getStringArray(R.array.stressUp);
        Action testAction = new Action(testArray);

        int[] mods = testAction.getMods();
        int currentEnergy = Integer.parseInt(energyValue.getText().toString());
        int currentStress = Integer.parseInt(stressValue.getText().toString());
        int currentHappiness = Integer.parseInt(happyValue.getText().toString());

        currentEnergy += mods[0];
        currentStress += mods[1];
        currentHappiness += mods[2];

        energyValue.setText(Integer.toString(currentEnergy));
        stressValue.setText(Integer.toString(currentStress));
        happyValue.setText(Integer.toString(currentHappiness));

    }



}
