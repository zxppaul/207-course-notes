/**
 * A rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a new rectangle.
   *
   * @param w width of the rectangle.
   * @param h height fo the rectangle.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Double rectangle's area.
   *
   * @return a doubled area
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the factor to scale the rectangle by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares the area of this rectangle to another rectangle.
   *
   * @param other the other rectangle to compare to
   * @return true if this rectangle is larger than the other rectangle, false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
