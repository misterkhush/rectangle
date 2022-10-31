package assignment.rectangle.logic;

import assignment.rectangle.entity.Rectangle;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class contains logic for Rectangle Operations
 * Intersection, Containment and Adjacent
 */
public class MainRectangleOperations {

    public static void main(String args[]) {

        RectangleOperations.isIntersecting(new Rectangle(0,4,6,8), new Rectangle(2,2,4,5));

        RectangleOperations.isIntersecting(new Rectangle(0,0,4,3), new Rectangle(3,1,6,2));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates for lower left and upper right corner of both rectangles(on separate likes) in this format (lowerX,lowerY,upperX,upperY): for example like this \n1,2,3,4\n5,6,7,8\nAnd then choose operation and press enter = 1:Intersection, 2: Containment, 3:Adjacent");

        int[] rec1Coordinates = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        Rectangle rec1 = new Rectangle(rec1Coordinates[0], rec1Coordinates[1], rec1Coordinates[2], rec1Coordinates[3]);
        int[] rec2Coordinates = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        Rectangle rec2 = new Rectangle(rec2Coordinates[0], rec2Coordinates[1], rec2Coordinates[2], rec2Coordinates[3]);

        String operation = sc.nextLine();

        switch (operation) {

            case "1":
                System.out.println("Result is :" +  RectangleOperations.isIntersecting(rec1, rec2));
                break;
            case "2":
                System.out.println("Result is :" +  RectangleOperations.isContainment(rec1, rec2));
                break;
            case "3":
                System.out.println(RectangleOperations.isAdjacent(rec1, rec2));
                break;
        }
    }
}
