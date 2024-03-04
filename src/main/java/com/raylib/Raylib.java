package com.raylib;

import com.raylib.core.rCore;
import com.raylib.extras.physac.Physac;
import com.raylib.models.rModels;
import com.raylib.raudioal.rAudioAL;
import com.raylib.shapes.rShapes;
import com.raylib.text.rText;
import com.raylib.textures.rTextures;

public class Raylib{

    public rAudioAL audio;
    public rCore core;
    public Config config;
    public rText text;
    public rShapes shapes;
    public rTextures textures;
    public rModels models;
    public Physac physac;

    /**
     * Creates new Raylib instance.
     */
    public Raylib(){
        audio = new rAudioAL();
        core = new rCore();
        config = new Config();
        text = new rText();
        shapes = new rShapes();
        textures = new rTextures();
        models = new rModels();
        physac = new Physac();
    }

    /**
     * Creates new Raylib instance and initializes the window
     * @param ScreenWidth width of the window in pixels
     * @param ScreenHeight height of the window in pixels
     * @param title title to display for the window
     */
    public Raylib(int ScreenWidth, int ScreenHeight, String title){
        audio = new rAudioAL();
        core = new rCore();
        config = new Config();
        text = new rText();
        shapes = new rShapes();
        textures = new rTextures();
        models = new rModels();
        physac = new Physac();

        core.InitWindow(ScreenWidth, ScreenHeight, title);
    }


}
