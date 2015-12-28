package com.zachcrabtree.commonconscience;

import java.util.Random;

// the human is the base class for all characters in an instance of a game
// the character will have some extra values in the end, but for now, the methods just
//create new humans from parents and from nowhere.

public class Human {

    //private values

    private int physicalVal, mentalVal, emotionalVal; //basic stats
    private String name;
    private void generateStats()
    {
        Random statGenerator = new Random();
        //generates a random stat from 1 - 10 for physical, mental, and emotional stats
        physicalVal = statGenerator.nextInt(11);
        mentalVal = statGenerator.nextInt(11);
        emotionalVal = statGenerator.nextInt(11);
    }

    //leave this for later. Molly Randy and Kipp will be the main characters for now.
    private void generateName()
    {
        //getting the maximum and minimum years (depending on the csv file used)
        int max = 2008;
        int min = 1880;
        Random generator = new Random();
        //generates a number between 1880 and 2008 to get year
        int targetYear = generator.nextInt( (max-min)+1 ) + min;
        //generates a 0 or 1, determines male (0) or female (1)
        int targetGender = generator.nextInt(1);
    }

    //constructors!

    Human()
    {
        generateStats();
        generateName();
    }

    Human(Human mom, Human dad)
    {
        //averages mom's and dad's stats
        physicalVal = (mom.getPhysicalVal() + dad.getPhysicalVal()) / 2;
        mentalVal = (mom.getMentalVal() + dad.getMentalVal()) / 2;
        emotionalVal = (mom.getEmotionalVal() + dad.getEmotionalVal()) / 2;
        generateName();

    }

    //get methods

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
