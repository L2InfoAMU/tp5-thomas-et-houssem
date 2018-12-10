package image;

import java.awt.*;
import java.util.ArrayList;package color;


public class PaletteRasterImage implements Image {
    private List <Color> palette;
    private int width;
    private int height;
    private int[][] IndexesOfColors;

    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        this.palette= new ArrayList<Color>();


    }


    public PaletteRasterImage(Color[][] pixels) {

    }

}
