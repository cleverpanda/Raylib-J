package com.raylib.models;

import com.raylib.raymath.Quaternion;
import com.raylib.raymath.Vector3;

public class Transform {

    public Vector3 translation;    // Translation
    public Quaternion rotation;    // Rotation
    public Vector3 scale;          // Scale

    public Transform() {
        translation = new Vector3();
        scale = new Vector3();
        rotation = new Quaternion();
    }

}
