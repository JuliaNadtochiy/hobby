package com.yulia;

public class Fishing extends Hobby {
    private long maxCatch;

    public Fishing(String nameOfHobby, byte amountOfYears, short numberOfOccupationPerWeek, float costForOneOccupation, long maxCatch) {
        super(nameOfHobby, amountOfYears, numberOfOccupationPerWeek, costForOneOccupation);
        this.maxCatch = maxCatch;
    }

    @Override
    public String toString() {
        return super.toString() + " Fishing{" +
                "maxCatch=" + maxCatch +
                "} ";
    }

    @Override
    public void tellAboutHobby() throws HobbyException {
        if( maxCatch <= 0 || getAmountOfYears() < 0 || getNumberOfOccupationPerWeek() < 0 || getCostForOneOccupation() < 0) throw new HobbyException();
        System.out.println(toString());
    }
}