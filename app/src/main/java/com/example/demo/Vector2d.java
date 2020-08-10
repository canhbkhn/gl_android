package com.example.demo;
import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vector2d {
    // constructor
    private static double x;
    private static double y;
    public Vector2d(){
        x = 0.0;
        y = 0.0;
    }

    public Vector2d(double x_, double y_){
        x = x_;
        y = y_;
    }

    public Vector2d(Vector2d v){
        x = v.x;
        y = v.y;
    }

    static Vector2d Add(Vector2d v1, Vector2d v2){
        Vector2d ret = new Vector2d(0.0,0.0);
        ret.x = v1.x + v2.x;
        ret.y = v1.y + v2.y;

        return ret;
    }

    static double length(){
        return sqrt(pow(x,2) + pow(y,2));
    }
}
