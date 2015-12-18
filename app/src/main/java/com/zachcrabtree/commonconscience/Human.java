package com.zachcrabtree.commonconscience;

import java.util.Random;

/**
 * Created by zakcrabtree on 12/17/15.
 */
public class Human {
    private int physicalVal = 0;
    private int mentalVal = 0;
    private int emotionalVal = 0;

    private void generateStats()
    {
        Random statGenerator = new Random();
        //generates a random stat from 1 - 10 for physical, mental, and emotional stats
        physicalVal = statGenerator.nextInt(11);
        mentalVal = statGenerator.nextInt(11);
        emotionalVal = statGenerator.nextInt(11);
    }

    public void Human()
    {
        generateStats();
    }

    public void Human(Human mom, Human dad)
    {
        //averages mom's and dad's stats
        physicalVal = (mom.physicalVal + dad.physicalVal) / 2;

    }
}
