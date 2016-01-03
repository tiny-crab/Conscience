package com.zachcrabtree.commonconscience;

public class Action {

    private String actionName;
    private String picFileName;
    private int stressMod;
    private int energyMod;
    private int happyMod;
    private int timeMod;
    private int moneyCost;

    Action(String[] values) {
        actionName = values[0];
        picFileName = values[1];
        stressMod = Integer.parseInt(values[2]);
        energyMod = Integer.parseInt(values[3]);
        happyMod = Integer.parseInt(values[4]);
        timeMod = Integer.parseInt(values[5]);
        moneyCost = Integer.parseInt(values[6]);
    }

    public String print() {
        String toPrint = this.actionName;
        return toPrint;
    }

    public int[] getMods(){
        int[] toReturn = new int[]{stressMod, energyMod, happyMod};
        return toReturn;
    }
}
