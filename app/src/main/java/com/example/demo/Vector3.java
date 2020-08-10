package com.example.demo;

import android.util.FloatMath;

public class Vector3 {
    public float x;
    public float y;
    public float z;

    // default constructor
    public Vector3(){

    }

    public Vector3(float __x, float __y, float __z){
        x = __x;
        y = __y;
        z = __z;
    }

    //add
    public final void add(Vector3 _v3){
        x += _v3.x;
        y += _v3.y;
        x += _v3.z;
    }

    public static Vector3 add(Vector3 _v1, Vector3 _v2){
        Vector3 ret = new Vector3(0.0f, 0.0f, 0.0f);
        ret.x = _v1.x + _v2.x;
        ret.y = _v1.y + _v2.y;
        ret.z = _v1.z + _v2.z;

        return ret;
    }
    
    // length of vector
    public float length(Vector3 _v3){
        return (float)Math.sqrt(_v3.x * _v3.x + _v3.y * _v3.y + _v3.z * _v3.z);
    }

    //this->length
    public float length(){
        return (float)Math.sqrt(x*x + y*y + z*z);
    }

    public void norm(){
        float len = length();

        x = x/len;
        y = y/len;
        z = z/len;
    }

    public void norm(Vector3 _v3){
        float len = length(_v3);

        _v3.x = _v3.x/len;
        _v3.y = _v3.y/len;
        _v3.z = _v3.z/len;
    }
}
