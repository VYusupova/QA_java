package figure;

public interface Color{
  void setFillColor(String color);

  void setBorderColor(String color);

  default String getFillColor(Figure figure) {

    if (figure instanceof Circle)
      return ((Circle) figure).fillColor;
    if (figure instanceof Rectangle)
      return ((Rectangle) figure).fillColor;
    if (figure instanceof Triangle)
      return ((Triangle) figure).fillColor;
    return "не известная фигура";
  }
  
  
  default String getBorderColor(Figure figure) {

    if (figure instanceof Circle)
      return ((Circle) figure).borderColor;
    if (figure instanceof Rectangle)
      return ((Rectangle) figure).borderColor;
    if (figure instanceof Triangle)
      return ((Triangle) figure).borderColor;
    return "не известная фигура";

  }
}