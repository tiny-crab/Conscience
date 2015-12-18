package com.zachcrabtree.commonconscience;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class GeneScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gene_screen);
        getSupportActionBar().hide();
    }
}
