package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private Color[][] pixels;
    public int width;
    public int height;

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
            Color[width][height]=color;
            for (height = 0; height < getHeight(); height++) {
                Color[width][height]=color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors) {
        this.pixels = colors;
    }
}
