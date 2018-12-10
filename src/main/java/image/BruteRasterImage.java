package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private Color[][] pixels;
    private int width;
    private int height;

    @Override
    public Color getPixelColor(int x, int y){
        return this.pixels[x][y];
    }

    @Override
    public int getWidth() {

        return width;
    }

    @Override
    public int getHeight() {

        return height;
    }

    public BruteRasterImage(Color color, int width, int height) {
        this.pixels = new Color[width][height];
        this.width = width;
        this.height = height;
        for (width = 0; width < getWidth(); width++) {
            for (height = 0; height < getHeight(); height++) {
                this.pixels[width][height]=color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors) {
        this.width = colors.length;
        this.height= colors[0].length;
        this.pixels = colors;
    }
}
