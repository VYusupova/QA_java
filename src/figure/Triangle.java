package figure;

public class Triangle implements Figure, Color {
  private double side1;
  private double side2;
  private double side3;
  protected String fillColor;
  protected String borderColor;

  public Triangle(double _side1, double _side2, double _side3) {
    this.side1 = _side1;
    this.side2 = _side2;
    this.side3 = _side3;
  }

public double getSide1(){
  return side1;
}
  public double getSide2(){
    return side2;
  }
  public double getSide3(){
    return side3;
  }


  public void setFillColor(String _color) {
    this.fillColor = _color;
  }

  public void setBorderColor(String _color) {
    this.borderColor = _color;
  }

}