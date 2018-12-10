package image;
import javafx.scene.paint.Color;
import java.util.ArrayList;package color;
import java.util.List;

public class PaletteRasterImage implements Image {
    private List <Color> palette;
    private int width;
    private int height;
    private int[][] indexesOfColors;

    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        this.palette= new ArrayList<Color>();
        createRepresentation();
        palette.add(color);
        setPixelsColor(color);


    }
    public PaletteRasterImage(Color[][] pixels) {
        this.height = getColumnCount(pixels);
        this.width = getRowCount(pixels);
        createRepresentation();
        setPixelsColor(pixels);
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        if(!palette.contains(color))
            palette.add(color);
        indexesOfColors[x][y] = palette.indexOf(color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    protected void setWidth(int width) {
        this.width = width;
    }

    @Override
    protected void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void createRepresentation() {
        this.palette = new ArrayList<>();
        this.indexesOfColors = new int[width][height];
    }

    @Override
    public void setPixelsColor(Color[][] pixels) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                palette.add(pixels[x][y]);
                indexesOfColors[x][y] = palette.indexOf(pixels[x][y]);
            }
        }
    }

    @Override
    private void setPixelsColor(Color color) {
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++)
                indexesOfColors[x][y] = palette.indexOf(color);
    }
}
