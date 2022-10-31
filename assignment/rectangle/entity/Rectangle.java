package assignment.rectangle.entity;

public class Rectangle {
    public Rectangle(int lowerX, int lowerY, int upperX, int upperY) {
        this.lowerX = lowerX;
        this.upperX = upperX;
        this.lowerY = lowerY;
        this.upperY = upperY;
    }

    int lowerX;// bottom right x coordinate
    int upperX;// upper right x coordinate
    int lowerY;// bottom right y coordinate
    int upperY;// upper right y coordinate

    public int getLowerX() {
        return lowerX;
    }

    public void setLowerX(int lowerX) {
        this.lowerX = lowerX;
    }

    public int getUpperX() {
        return upperX;
    }

    public void setUpperX(int upperX) {
        this.upperX = upperX;
    }

    public int getLowerY() {
        return lowerY;
    }

    public void setLowerY(int lowerY) {
        this.lowerY = lowerY;
    }

    public int getUpperY() {
        return upperY;
    }

    public void setUpperY(int upperY) {
        this.upperY = upperY;
    }

}
