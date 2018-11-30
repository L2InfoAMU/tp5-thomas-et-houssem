package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image
{
        private Color[][] pixels;
        public int width;
        public int height;

        public BruteRasterImage(Color color, int width, int height)
        {
            this.pixels= Color[width][height] pixels;
            this.width=width;
            this.height=height;
        }
        public BruteRasterImage(Color[][] colors)
        {
            this.pixels= colors;
        }
}
