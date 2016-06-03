package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/2/16.
 */
public class ChickenFood implements ChickenFoodRecipe {


    private String vegtable;
    private String vitimins;
    private String meat;

    public String getMeat() {
        return meat;
    }


    public String getVegtable() {
        return vegtable;
    }



    public String getVitimins() {
        return vitimins;
    }




    @Override
    public void setMeat(String meat) {
        this.meat =meat;
    }

    @Override
    public void setVegtables(String veg) {
        this.vegtable =veg;

    }

    @Override
    public void setVitimins(String vit) {
        this.vitimins =vit;

    }
}
