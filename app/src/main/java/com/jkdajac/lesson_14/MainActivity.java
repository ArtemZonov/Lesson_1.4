package com.jkdajac.lesson_14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car("Ford", 2, 5);

do {
    car.farOneKm();
}    while(car.balanceFuel != 0);
    Log.d("MyLOG", "Your box of fuel is empty !");


for(int i = 0; i < 1200; i++){
    car.farOneKm();
    car.addFuel();
    Log.d("MyLOG", "You traveled 1200 km !");

}


    }
}