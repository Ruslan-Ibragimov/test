import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Objects;
import java.util.stream.Collectors;

public class LimitingRectangle {
    int[][] points;
    int xmax = 0;

    int xmin = 0;
    int ymax = 0;
    int ymin = 0;
    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int getWidth(){
        for (int i = 0; i < points.length; i++) {
                if (points[i][0] > xmax)
                    xmax = points[i][0];
                else if (points[i][0] < xmin)
                    xmin = points[i][0];

        }
        return xmax - xmin;
    }

    public int getHeight(){
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] > ymax)
                ymax = points[i][1];
            else if (points[i][1] < ymin)
                ymin = points[i][1];
        }
        return ymax - ymin;
    }
    public String getBorders(){
        return String.format("%d, %d, %d, %d", ymin, ymax, xmin, xmax);
    }
}
