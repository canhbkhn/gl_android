package com.example.demo;

public class PointLight {
    // ambient lighting: chiếu sáng vào một object mà mọi đỉnh đều như nhau và
    // không phụ thuộc vào vị trí của nguồn sáng
    private float[] m_LightAmbient = new float[3];
    // diffuse lighting: chiếu sáng vào một object mà độ sáng phụ thuộc vào góc giữa
    // các đỉnh hợp với nguồn sáng
    private float[] m_LightDiffuse = new float[3];
    // specular lighting: độ sáng chiếu vào object phụ thuộc cả vào góc giữa các đỉnh
    // và vị trí của người nhìn hoặc vị trí của camera
    private float[] m_LightSpecular = new float[3];

    private float m_SpecularShininess = 5;
    private Vector3 m_Position;


}
