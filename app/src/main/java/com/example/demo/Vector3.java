package com.example.demo;

import android.util.FloatMath;

import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

public class Vector3 {
    public static float x;
    public static float y;
    public static float z;

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

    // cross product: tich vo huong
    static Vector3 CrossProduct(Vector3 _v1, Vector3 _v2){
        Vector3 ret = new Vector3(0.0f, 0.0f, 0.0f);
        ret.x = (_v1.y*_v2.z) - (_v1.z*_v2.y);
        ret.y = (_v1.z*_v2.x) - (_v1.x*_v2.z);
        ret.z = (_v1.x*_v2.y) - (_v1.y*_v2.x);
        return ret;
    }

    // dot product: tich co huong
    static float DotProduct(Vector3 _v){
        return (x*_v.x) + (y*_v.y) + (z*_v.z);
    }

    // multiply
    public void Multiply(float _v){
        x *= _v;
        y *= _v;
        z *= _v;
    }

    // negation
    public void negate(){
        x = -x;
        y = -y;
        z = -z;
    }
    // su dung ma tran de di chuyen doi tuong
    // translateM() function
    // Matrix.translateM(positionMatrix,0,position.x,position.y,position.z
}
