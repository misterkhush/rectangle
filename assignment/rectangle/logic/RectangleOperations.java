package assignment.rectangle.logic;

import assignment.rectangle.entity.Rectangle;

/** This class contains Rectangle operations such as:
 *  Intersection, Containment, Adjacent
 */
public class RectangleOperations {

    private static boolean isRectangle(Rectangle rec1, Rectangle rec2){

        int rec1width = rec1.getUpperX()-rec1.getLowerX();
        int rec1height= rec1.getUpperY()-rec1.getLowerY();

        int rec2width = rec2.getUpperX()-rec2.getLowerX();
        int rec2height= rec2.getUpperY()-rec2.getLowerY();

        if (rec1.getLowerX() == rec1.getUpperX() || rec1.getLowerY() == rec1.getUpperY() ||
                rec2.getLowerX() == rec2.getUpperX() || rec2.getLowerY() == rec2.getUpperY()) {
            return false;
        }

        if (rec1width != rec1height && rec2width != rec2height){
            return true;
        }

        return false;
    }

    /**
     * @param rec1
     * @param rec2
     * @return boolean
     */
    public static String isIntersecting(Rectangle rec1, Rectangle rec2) {

        if(rec1 == null || rec2 == null || !isRectangle(rec1,rec2)){
            throw new  IllegalArgumentException("Illegal Rectangle Coordinates");
        }

        int x1 = Math.max(rec1.getLowerX(), rec2.getLowerX());
        int y1 = Math.max(rec1.getLowerY(), rec2.getLowerY());

        // gives top-right point
        // of intersection rectangle
        int x2 = Math.min(rec1.getUpperX(), rec2.getUpperX());
        int y2 = Math.min(rec1.getUpperY(), rec2.getUpperY());


        if (!(Math.min(rec1.getUpperX(), rec2.getUpperX()) > Math.max(rec1.getLowerX(), rec2.getLowerX()) && // width > 0
                Math.min(rec1.getUpperY(), rec2.getUpperY()) > Math.max(rec1.getLowerY(), rec2.getLowerY()))) // height > 0
        {
           return "Rectangles don't Intersect";
        }
        return "Points of intersection are: " + "(" + x1 + ", " +
                y1 + ") " + "(" + x2 + ", " +
                y2 + ") " + "(" + x2 + ", " +
                y1 + ") " +"(" + x1 + ", " +
                y2 + ")";
    }

    /**
     * @param rec1
     * @param rec2
     * @return boolean
     */
    public static boolean isContainment(Rectangle rec1, Rectangle rec2) {

        if(rec1 == null || rec2 == null || !isRectangle(rec1,rec2)){
            throw new  IllegalArgumentException("Illegal Rectangle Coordinates");
        }

        boolean isContained1 = (rec2.getUpperX() < rec1.getUpperX() && // upper x
                rec2.getUpperY() < rec1.getUpperY() && // upper y
                rec2.getLowerX() > rec1.getLowerX() && // lower x
                rec2.getLowerY() > rec1.getLowerY()); // lower y

        boolean isContained2 = (rec1.getUpperX() < rec2.getUpperX() && // upper x
                rec1.getUpperY() < rec2.getUpperY() && // upper y
                rec1.getLowerX() > rec2.getLowerX() && // lower x
                rec1.getLowerY() > rec2.getLowerY()); // lower y

        return isContained1 || isContained2;
    }

    /**
     * @param rec1
     * @param rec2
     * @return boolean
     */
    public static boolean isAdjacent(Rectangle rec1, Rectangle rec2) {

        if(rec1 == null || rec2 == null || !isRectangle(rec1,rec2)){
            throw new  IllegalArgumentException("Illegal Rectangle Coordinates");
        }

        return (Math.min(rec1.getUpperX(), rec2.getUpperX()) - Math.max(rec1.getLowerX(), rec2.getLowerX()) == 0 || // width > 0
                Math.min(rec1.getUpperY(), rec2.getUpperY()) - Math.max(rec1.getLowerY(), rec2.getLowerY()) == 0);  // height > 0

    }
}
