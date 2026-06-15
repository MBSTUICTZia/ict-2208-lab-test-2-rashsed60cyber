// Enter code here
package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfShapes = input.nextInt();

        Shape[] shapes = new Shape[numberOfShapes];

        for (int i = 0; i < numberOfShapes; i++) {

            String shapeType = input.next();
            String color = input.next();
            boolean filled = input.nextBoolean();

            if (shapeType.equals("RECTANGLE")) {

                double width = input.nextDouble();
                double length = input.nextDouble();

                shapes[i] = new Rectangle(color, filled, width, length);

            } else if (shapeType.equals("CIRCLE")) {

                double radius = input.nextDouble();

                shapes[i] = new Circle(color, filled, radius);
            }
        }

        for (int i = 0; i < numberOfShapes; i++) {
            System.out.println(shapes[i]);
            System.out.println();
        }

        System.out.println("--- Downcast Check ---");

        for (int i = 0; i < numberOfShapes; i++) {

            if (shapes[i] instanceof Rectangle) {

                Rectangle rectangle = (Rectangle) shapes[i];

                System.out.println("Rectangle width=" + rectangle.getWidth()
                        + " length=" + rectangle.getLength());

            } else if (shapes[i] instanceof Circle) {

                Circle circle = (Circle) shapes[i];

                System.out.println("Circle radius=" + circle.getRadius());
            }
        }

        input.close();
    }
}
