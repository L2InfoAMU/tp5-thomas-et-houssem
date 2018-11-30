package image;

import javafx.scene.paint.Color;

/**
 * Created by Arnaud Labourel on 09/11/2018.
 */
public interface Image {
    Color getPixelColor(int x, int y);
    int getWidth();
    int getHeight();
}

public class BruteRasterImage implements Image{
    private Color color;
    public int width;
    public int height;

    public BruteRasterImage(Color color, int width, int height){
        this.color=color;
        this.width=width;
        this.height=height;
    }
    public BruteRasterImage(Color[][] colors){
        this.Color[x]=x;
        this.Color[y]=y;
    }
}