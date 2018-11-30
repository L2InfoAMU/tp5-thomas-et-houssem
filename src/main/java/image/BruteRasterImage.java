package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image
{
        private Color color;
        public int width;
        public int height;

        public BruteRasterImage(Color color, int width, int height)
        {
            this.color=color;
            this.width=width;
            this.height=height;
        }
        public BruteRasterImage(Color[][] colors)
        {
            public void createRepresentation();
            int i,j;
            for(i=0; i< getWidth();i++)
            {
                for(j=0;j< getHeight();j++)
                {
                    public void setPixelColor(Color color, int x, int y);
                    public Color getPixelColor(int x, int y);
                }
            }
        }
}
