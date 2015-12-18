package com.zachcrabtree.commonconscience;

import java.util.Random;

/**
 * Created by zakcrabtree on 12/17/15.
 */
public class Human {

    //private values

    private int physicalVal, mentalVal, emotionalVal; //basic stats
    private void generateStats()
    {
        Random statGenerator = new Random();
        //generates a random stat from 1 - 10 for physical, mental, and emotional stats
        physicalVal = statGenerator.nextInt(11);
        mentalVal = statGenerator.nextInt(11);
        emotionalVal = statGenerator.nextInt(11);
    }

    //constructors!

    Human()
    {
        generateStats();
    }

    Human(Human mom, Human dad)
    {
        //averages mom's and dad's stats
        physicalVal = (mom.getPhysicalVal() + dad.getPhysicalVal()) / 2;
        mentalVal = (mom.getMentalVal() + dad.getMentalVal()) / 2;
        emotionalVal = (mom.getEmotionalVal() + dad.getEmotionalVal()) / 2;

    }

    //return methods

    public int getPhysicalVal()
    {
        return physicalVal;
    }
    public int getMentalVal()
    {
        return mentalVal;
    }
    public int getEmotionalVal()
    {
        return emotionalVal;
    }

    //public functions

}
