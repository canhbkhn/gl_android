package com.example.demo;

import android.content.Context;
import android.graphics.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class OpenGLRenderer implements GLSurfaceView.Renderer {

    private Triangle mTriangle;
    private final float[] vPMatrix = new float[16];
    private final float[] projectionMatrix = new float[16];
    private float[] rotationMatrix = new float[16];

    private Context m_Context;
    private PointLight m_PointLight;
    private Camera m_Camera;
    private int m_ViewPortWidth;
    private int m_ViewPortHeight;
    private Cube m_Cube;


    public volatile float Angle;
    // assignment constructor
    public OpenGLRenderer(Context context){
        m_Context = context;
    }
    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        // clear buffer hold colors
        GLES20.glClearColor(1f,0,0, 1f);

        mTriangle = new Triangle();
    }

    @Override
    public void onSurfaceChanged(GL10 unused, int width, int height) {
        GLES20.glViewport(0,0, width, height);
        float ratio = (float)width/height;

        Matrix.frustumM(projectionMatrix, 0, -ratio, ratio, -1, 1, 3, 7);
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        float[] scratch = new float[16];

        Matrix.setRotateM(rotationMatrix, 0, Angle, 0,0,-1.0f);
        Matrix.multiplyMM(scratch,0,vPMatrix,0,rotationMatrix,0);

        mTriangle.draw();
    }

    public static int loadShader(int type, String shaderCode){
        int shader = GLES20.glCreateShader(type);

        // add the source code to the shader and compile it
        GLES20.glShaderSource(shader, shaderCode); // compile shader code
        GLES20.glCompileShader(shader);

        return shader;
    }

    public float GetAngle(){
        return Angle;
    }

    public void SetAngle(float Angle_){
        Angle = Angle_;
    }
}
