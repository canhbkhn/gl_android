package com.example.demo;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.content.Context;
import android.opengl.Matrix;

public class Common {
    private float[] m_OrientationMatrix = new float[16];
    private float[] m_PositionMatrix = new float[16];
    private float[] m_RotationMatrix = new float[16];
    private float[] m_ScaleMatrix = new float[16];
    private float[] m_TempMatrix = new float[16];
    // lights
    void SetupLight(){

    }

    // camera
    void SetupCamera(Vector3 Eye, Vector3 Center, Vector3 Up){
        // create matrix
    }

    // set orientation matrix
    void SetPositionMatrix(Vector3 postion){
        Matrix.setIdentityM( m_PositionMatrix, 0);
        Matrix.translateM(m_PositionMatrix, 0, postion.x, postion.y, postion.z);
    }

    // set scale matrix
    void SetScaleMatrix(Vector3 scale){
        Matrix.setIdentityM(m_ScaleMatrix, 0);
        Matrix.scaleM(m_ScaleMatrix,0,scale.x,scale.y,scale.z);
    }

}
