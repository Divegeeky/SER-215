public class FindNearestPoints {

  public static void main(String[] args) {

    // Each row in points represents a point
    double[][] points = {{-1, 3}, {-1, -1}, {1, 1},
                        {2, 0.5}, {2, -1}, {3, 3}, {4, 2}, {4, -0.5}};

    // p1 and p2 are the indices in the points array
    int p1 = 0, p2 = 1; // Initial two points

    double shortestDistances = distance(points[p1][0], points[p1][1],
				       points[p2][0], points[p2][1]); // Initialize shortestDistances


    // Compute distance for every two points
    for (int i = 0; i < points.length; i++) {

      for (int j = i + 1; j < points.length; j++) {

        double distance = distance(points[i][0], points[i][1],
                                   points[j][0], points[j][1]); // Find distance

        if (shortestDistances > distance) {
          p1 = i; // Update p1
          p2 = j; // Update p2
          shortestDistances = distance; // Update shortestDistances
        }
      }
    }


    // Display result
    System.out.println("The closest two points are " +
                       "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                        points[p2][0] + ", " + points[p2][1] + ")");

  }


  /** Compute the distance between two points */
   public static double distance(double x1, double y1, double x2, double y2) {

    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

  }

}
