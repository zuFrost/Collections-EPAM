package com.zufrost.learn.enumset;

public enum  Country {
    ARMENIA(3, 28_470),
    BEKARUS(9, 202_910),
    INDIA(1_370, 2_973_190),
    KAZAKHSTAN(18, 2_899_700),
    POLAND(38, 306_230),
    UKRAINE(43, 579_320);
    private int population; //per bln
    private int landArea; //per bln

    Country(int population, int landArea) {
        this.population = population;
        this.landArea = landArea;
    }

    public void grow(int additionalPopulation) {
        population += additionalPopulation;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getLandArea() {
        return landArea;
    }

    public void setLandArea(int landArea) {
        this.landArea = landArea;
    }
}