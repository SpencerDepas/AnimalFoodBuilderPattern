package com.clearfaun.playing.around;

public class Main {

    public static void main(String[] args) {

        //Notes
        //I have no idea how to name these classes


        FoodBuilder chickenFoodBuilder = new FoodForChickensBuilder();



        FoodEngineer foodEngineer = new FoodEngineer(chickenFoodBuilder);

        foodEngineer.makeFood();



        ChickenFood chickenFood = foodEngineer.getChickenFood();



        System.out.println("chickenFood");

        System.out.println("chickenFood meat Type: " + chickenFood.getMeat());

        System.out.println("chickenFood veg Type: " + chickenFood.getVegtable());

        System.out.println("chickenFood vit Type: " + chickenFood.getVitimins());

        //output

        //chickenFood meat Type: pigs and donkey heads
        //chickenFood veg Type: sweet potato
        //chickenFood vit Type: B12, we love marmite

    }
}
