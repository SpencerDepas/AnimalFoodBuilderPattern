package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/2/16.
 */
public class FoodForChickensBuilder implements FoodBuilder {


    ChickenFood chickenFood;

    FoodForChickensBuilder(){

        chickenFood = new ChickenFood();

    }

    @Override
    public void buildVegtables() {
        chickenFood.setVegtables("sweet potato");
    }

    @Override
    public void buildMeat() {
        chickenFood.setMeat("pigs and donkey heads");

    }

    @Override
    public void buildVitimins() {
        chickenFood.setVitimins("B12, we love marmite");

    }

    @Override
    public ChickenFood getFood() {
        return chickenFood;
    }
}
