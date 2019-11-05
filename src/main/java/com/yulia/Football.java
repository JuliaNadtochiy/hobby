package com.yulia;

public class Football extends Hobby{
    private int numberOfMatches;
    private double numberOfWins;

    public Football(String nameOfHobby, byte amountOfYears, short numberOfOccupationPerWeek, float costForOneOccupation, int numberOfMatches, double numberOfWins) {
        super(nameOfHobby, amountOfYears, numberOfOccupationPerWeek, costForOneOccupation);
        this.numberOfMatches = numberOfMatches;
        this.numberOfWins = numberOfWins;
    }

    @Override
    public String toString() {
        return super.toString() + " Football{" +
                "numberOfMatches=" + numberOfMatches +
                ", numberOfWins=" + numberOfWins +
                "} " ;
    }

    @Override
    public void tellAboutHobby() throws HobbyException{
        if(numberOfWins < 0  || numberOfMatches < 0 || getAmountOfYears() < 0 || getNumberOfOccupationPerWeek() < 0 || getCostForOneOccupation() < 0) throw new HobbyException();
        System.out.println(toString());
    }
}
