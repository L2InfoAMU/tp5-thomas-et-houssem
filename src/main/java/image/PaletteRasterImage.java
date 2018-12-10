package image;
import javafx.scene.paint.Color;
import java.util.ArrayList;package color;
import java.util.List;

public class PaletteRasterImage implements Image {
    private List <Color> palette;
    private int width;
    private int height;
    private int[][] IndexesOfColors;

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

}
