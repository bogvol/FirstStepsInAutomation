package helper;

/**
 * Created by Kengoroo_a on 02.04.2017.
 */
public class CoordinateHelper {

    public static final MIN_COORDINATE = 0;

    public static final MAX_COORDINATE = 2;

    public static boolean checkCoordinate(final int coordinate) {
        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) return false;
        return true;
    }
}
