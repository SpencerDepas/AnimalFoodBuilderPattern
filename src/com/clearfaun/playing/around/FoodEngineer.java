package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/2/16.
 */
public class FoodEngineer  {

    FoodBuilder foodBuilder;

    FoodEngineer(FoodBuilder foodBuilder){
        this.foodBuilder = foodBuilder;
    }


    public ChickenFood getChickenFood(){

        return this.foodBuilder.getFood();


    }

    public void makeFood() {

        this.foodBuilder.buildMeat();
        this.foodBuilder.buildVegtables();
        this.foodBuilder.buildVitimins();

    }
}
