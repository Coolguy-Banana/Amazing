public static Point centerOfMass(Point[] points) {
    if (points == null || points.length == 0) {
      return null;
    }
    
    double totalX = 0;
    double totalY = 0;
    
    for (Point p : points) {
        totalX += p.getX(); 
        totalY += p.getY(); 
    }
    
    double centerX = totalX / points.length;
    double centerY = totalY / points.length;
    
    return new Point(centerX, centerY);
}

public class Point {
    private double x, y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

  
    public double angle() {
        double angleRadians = Math.atan2(this.y, this.x);
        return Math.toDegrees(angleRadians);
    }
    public static void main(String[] args) {
        Point p1

          public class Grid {
    private int sideLength; 
    private static int currentMaxSideLength = 0;

  
    public Grid(int sideLength) {
        this.sideLength = sideLength;

     
        if (sideLength > currentMaxSideLength) {
            currentMaxSideLength = sideLength;
        }
    }

    public int getSideLength() {
        return sideLength;
    }

    public static int maxSideLength() {
        return currentMaxSideLength;
    }

 
    public static void main(String[] args) {
        Grid g1 = new Grid(5);
        Grid g2 = new Grid(10);
        Grid g3 = new Grid(7);
        System.out.println("Max side length so far: " + Grid.maxSideLength()); 
        Grid g4 = new Grid(15);
        System.out.println("Max side length so far: " + Grid.maxSideLength()); 
    }
}

      public class Circle {
    private double centerX, centerY, radius;


    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public static Circle fromThreePoints(double x1, double y1, double x2, double y2, double x3, double y3) {
      
        double midX1 = (x1 + x2) / 2;
        double midY1 = (y1 + y2) / 2;
        double midX2 = (x2 + x3) / 2;
        double midY2 = (y2 + y3) / 2;

      
        double slope1 = -(x2 - x1) / (y2 - y1);
        double slope2 = -(x3 - x2) / (y3 - y2);

    
        double centerX = (slope1 * midX1 - slope2 * midX2 + midY2 - midY1) / (slope1 - slope2);
        double centerY = slope1 * (centerX - midX1) + midY1;

      
        double radius = Math.sqrt(Math.pow(centerX - x1, 2) + Math.pow(centerY - y1, 2));


        return new Circle(centerX, centerY, radius);
    }
    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }

      public static void main(String[] args) {
 double x1 = 0, y1 = 0;
 double x2 = 1, y2 = 0;
 double x3 = 0, y3 = 1;

        Circle c = Circle.fromThreePoints(x1, y1, x2, y2, x3);
        System.out.println("Center: (" + c.getCenterX() + ", " + c.getCenterY() + ")");
        System.out.println("Radius: " + c.getRadius());
    }
}
public class RightTriangle implements Shape {
    private double x; 
    private double y;
    private double sideA; 
    private double sideB; 

  
    public RightTriangle(double x, double y, double sideA, double sideB) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

     @Override
    public double area() {
        return (sideA * sideB) / 2;
    }

   
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return sideA + sideB + hypotenuse;
    }

  
    @Override
    public String toString() {
        return String.format("RightTriangle [corner=(%.2f, %.2f), sideA=%.2f, sideB=%.2f]", x, y, sideA, sideB);
    }

    public static void main(String[] args) {
        RightTriangle rt1 = new RightTriangle(0, 0, 3, 4);
        System.out.println(rt1);
        System.out.println("Area: " + rt1.area());        
        System.out.println("Perimeter: " + rt1.perimeter());

        RightTriangle rt2 = new RightTriangle(5, 5, 6, 8);
        System.out.println(rt2);
        System.out.println("Area: " + rt2.area());       
        System.out.println("Perimeter: " + rt2.perimeter());
    }
}

      import java.util.ArrayList;

public class LibraryItem {
    private String title;
    private boolean isAvailable
    public LibraryItem(String title, boolean isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }
  
    public boolean isAvailable() {
        return isAvailable;
    }

   
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableItems = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

   
    public static void main(String[] args) {
      
        LibraryItem[] items = {
            new LibraryItem("Book A", true),
            new LibraryItem("Book B", false),
            new LibraryItem("Book C", true),
            new LibraryItem("Book D", false)
        };
        ArrayList<LibraryItem> available = LibraryItem.availableItems(items);
        System.out.println("Available items:");
        for (LibraryItem item : available) {
            System.out.println(item.getTitle());
        }
    }
}




