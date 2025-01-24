import animal.*;
import figure.*;

public class Main {
  public static void main(String[] args) {
    testAnimal();
    testFigure();
  }

  public static void testAnimal(){
    System.out.println("\n\tЗадание 1: наследование \n");
    
    Dish dish = new Dish(10);
    int countCats = 5;
    Cat cats[] = new Cat[countCats];
    cats[0] = new Cat("Томас");
    cats[1] = new Cat("Бегемот");
    cats[2] = new Cat("Филипп Маркович");
    cats[3] = new Cat("Xen");
    cats[4] = new Cat("Мурчало");

    for (int i = 0; i < countCats; i++) {
      cats[i].eat(dish, 3);
    }

    for (int i = 0; i < countCats; i++) {
      cats[i].getIsWeelFed();
    }
  }

  public static void testFigure() {
    System.out.println("\n\tЗадание 2 : работа с интерфейсами и их дефолтными методами\n");
    Circle circle = new Circle(5);
    circle.setFillColor("red");
    circle.setBorderColor("black");

    Rectangle rectangle = new Rectangle(4, 6);
    rectangle.setFillColor("blue");
    rectangle.setBorderColor("white");

    Triangle triangle = new Triangle(3, 4, 5);
    triangle.setFillColor("green");
    triangle.setBorderColor("yellow");

    System.out.println("Круг периметр = " + circle.getPerimeter(circle));
    System.out.println("Круг площадь =  " + circle.getArea(circle));
    System.out.println("Круг цвет заливки - " + circle.getFillColor(circle));
    System.out.println("Круг цвет границ - " + circle.getBorderColor(circle));

    System.out.println("Прямоугольник перимерт = " + rectangle.getPerimeter(rectangle));
    System.out.println("Прямоугольник площадь = " + rectangle.getArea(rectangle));
    System.out.println("Прямоугольник цвет заливки - " + rectangle.getFillColor(rectangle));
    System.out.println("Прямоугльник цвет границ - " + rectangle.getBorderColor(rectangle));

    System.out.println("Треугольник периметр = " + triangle.getPerimeter(triangle));
    System.out.println("Треугольник площадь = " + triangle.getArea(triangle));
    System.out.println("Треугольник цвет заливки - " + triangle.getFillColor(triangle));
    System.out.println("Треугольник цвет граинц - " + triangle.getBorderColor(triangle));

  }

}