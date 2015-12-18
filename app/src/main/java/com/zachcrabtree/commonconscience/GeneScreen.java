package com.zachcrabtree.commonconscience;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GeneScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gene_screen);
        getSupportActionBar().hide();
        //create mother, father, and character
        Human motherObj = new Human();
        Human fatherObj = new Human();
        Human myCharacterObj = new Human(motherObj, fatherObj);

        //get the places in which the values will be printed
        TextView motherName = (TextView) findViewById(R.id.motherName);
        TextView motherPhys = (TextView) findViewById(R.id.mPhysStat);
        TextView motherMent = (TextView) findViewById(R.id.mMentStat);
        TextView motherEmot = (TextView) findViewById(R.id.mEmotStat);

        TextView fatherName = (TextView) findViewById(R.id.fatherName);
        TextView fatherPhys = (TextView) findViewById(R.id.fPhysStat);
        TextView fatherMent = (TextView) findViewById(R.id.fMentStat);
        TextView fatherEmot = (TextView) findViewById(R.id.fEmotStat);

        TextView charName = (TextView) findViewById(R.id.characterName);
        TextView charPhys = (TextView) findViewById(R.id.cPhysStat);
        TextView charMent = (TextView) findViewById(R.id.cMentStat);
        TextView charEmot = (TextView) findViewById(R.id.cEmotStat);

        motherName.setText("Molly");
        motherPhys.setText("" + motherObj.getPhysicalVal());
        motherMent.setText("" + motherObj.getMentalVal());
        motherEmot.setText("" + motherObj.getEmotionalVal());

        fatherName.setText("Randy");
        fatherPhys.setText("" + fatherObj.getPhysicalVal());
        fatherMent.setText("" + fatherObj.getMentalVal());
        fatherEmot.setText("" + fatherObj.getEmotionalVal());

        charName.setText("Kipp");
        charPhys.setText("" + myCharacterObj.getPhysicalVal());
        charMent.setText("" + myCharacterObj.getMentalVal());
        charEmot.setText("" + myCharacterObj.getEmotionalVal());
    }

    public void startLife(View view)
    {
        Intent toPlayerScreen = new Intent(this, PlayerScreen.class);
        startActivity(toPlayerScreen);
    }
}
