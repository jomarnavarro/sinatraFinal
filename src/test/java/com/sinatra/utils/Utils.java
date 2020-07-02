package com.sinatra.utils;

import java.util.Random;

public class Utils {

    public static int asignarALuisRamos() {
        return new Random().nextInt(5) + 1;

    }

    public static void main(String[] args) {
        System.out.println(asignarALuisRamos());
    }
}
