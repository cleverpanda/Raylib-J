package com.raylib.models;

import com.raylib.core.Color;
import com.raylib.textures.Texture2D;

public class MaterialMap {

    public Texture2D texture;      // Material map texture
    public Color color;            // Material map color
    public float value;            // Material map value

    public MaterialMap(){
        texture = new Texture2D();
        color = new Color();
        value = 0f;
    }

}
