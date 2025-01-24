package animal;

public class Cat extends Animal {
  private static int countCat = 0;

  public Cat(String nameCat) {
    this.name = nameCat;
    maxRunDistance = 200;
    countCat++;
  }

  public static int getCountCat() {
    return countCat;
  }

  @Override
  public void voice() {
    System.out.println(name + " говорит Мяу");
  }

  @Override
  public void swim() {
    System.out.println("Коты не умеют плавать");
  }

  @Override
  public void swim(int distance) {
    swim();
  }
}