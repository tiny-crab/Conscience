package com.zachcrabtree.commonconscience;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

//this screen will be the first screen that the user encounters
//they can create a new game, change whatever settings need to be changed,
// continue the current game, and check high scores

public class MainMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        getSupportActionBar().hide();
    }

    public void newGame(View view) {
        Intent toGeneScreen = new Intent(this, GeneScreen.class);
        startActivity(toGeneScreen);
    }
}
