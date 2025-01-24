package figure;

public interface Figure {
  
  default double getPerimeter(Figure figure) {
    if (figure instanceof Circle)
      return (2 * Math.PI * ((Circle) figure).getRadius());
    if (figure instanceof Rectangle) {
      double _width = ((Rectangle) figure).getWidth();
      double _height = ((Rectangle) figure).getHeight();
      return (2 * (_width + _height));
    }
    if (figure instanceof Triangle) {
      double perimTriangle = ((Triangle) figure).getSide1();
      perimTriangle += ((Triangle) figure).getSide2();
      perimTriangle += ((Triangle) figure).getSide3();
      return perimTriangle;
    }
    return 0;
  }

  default double getArea(Figure figure) {
    if (figure instanceof Circle) {
      double r = ((Circle) figure).getRadius();
      return (Math.PI * (r * r));
    }
    if (figure instanceof Rectangle) {
      double _width = ((Rectangle) figure).getWidth();
      double _height = ((Rectangle) figure).getHeight();
      return (_width * _height);
    }
    if (figure instanceof Triangle) {
      double p = getPerimeter((Triangle) figure);
      double side1 = ((Triangle) figure).getSide1();
      double side2 = ((Triangle) figure).getSide2();
      double side3 = ((Triangle) figure).getSide3();
      return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    return 0;
  }

}