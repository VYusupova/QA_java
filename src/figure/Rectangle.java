package figure;

public class Rectangle implements Figure, Color {
  private double width;
  private double height;
  protected String fillColor;
  protected String borderColor;

  public Rectangle(double _width, double _height) {
    this.width = _width;
    this.height = _height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }


  public void setFillColor(String _color) {
    this.fillColor = _color;
  }

  public void setBorderColor(String _color) {
    this.borderColor = _color;
  }

}
