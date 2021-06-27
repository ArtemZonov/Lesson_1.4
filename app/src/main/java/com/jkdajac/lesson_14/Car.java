package com.jkdajac.lesson_14;

import android.util.Log;

public class Car {

    public String model;
    public int consumptionFuel;
    public int balanceFuel;
    boolean ride = true;

    public Car(String model, int consumptionFuel, int balanceFuel){
       this.model = model;
       this.consumptionFuel = consumptionFuel;
       this.balanceFuel = balanceFuel;
}

       public  void startEngine(){
        boolean start = true;
        if(start){
            farOneKm();
        } else {
            start = false;
            Log.d("MyLOG", "Please, start engine !");
        }

       }

       public  void addFuel(){
           balanceFuel += consumptionFuel;
       }

       public  void farOneKm(){
          if(balanceFuel >= consumptionFuel){
              ride = true;
            Log.d("Mylog", "You have traveled 1 km");
       } else {
             ride = false;
            Log.d("MyLOG", "Your balance of fuel is ended !");
       }
       }


}
