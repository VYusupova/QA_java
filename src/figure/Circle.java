package figure;

public class Circle implements Figure, Color {
  private double radius;
  protected String fillColor;
  protected String borderColor;

  public Circle(double _radius) {
    this.radius = _radius;
  }

  public double getRadius(){
    return radius;
  }


public void setFillColor(String _color) {
this.fillColor = _color;
}

public void setBorderColor(String _color) {
this.borderColor = _color;
}

}