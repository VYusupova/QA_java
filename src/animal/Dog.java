package animal;

public class Dog extends Animal {
  private static int countDog = 0;

  public Dog(String nameDog) {
    this.name = nameDog;
    maxRunDistance = 500;
    maxSwimDistance = 10;
    countDog++;
  }

  public static int getCountDog() {
    return countDog;
  }

  @Override
  public void voice() {
    System.out.println(name + " говорит Гав");
  }

}