package animal;

public abstract class Animal {
  private static int countAnimal = 0;
  protected String name = "Животное";
  protected int maxRunDistance = 100;
  protected int maxSwimDistance = 1;
  protected boolean isWellFed = false;

  public Animal() {
    countAnimal++;
  }

  public static int getCountAnimal() {
    return countAnimal;
  }

  public void setName(String _name) {
    this.name = _name;
  }

  abstract void voice();

  void run(int distance) {
    if (distance > maxRunDistance)
      System.out.println(name + " не может бежать дальше " + maxRunDistance + " метров");
    else
      System.out.println(name + " бежит " + distance + " метров");
  }

  public void swim() {
    System.out.println(name + " плывет");
  }

  void swim(int distance) {
    if (distance > maxSwimDistance)
      System.out.println(name + " не может плыть дальше " + maxSwimDistance + " метров");
    else
      System.out.println(name + " плывет " + distance + " метров");
  }

  public void eat(Dish dish, int countEat) {
    int sub = dish.getFeed() - countEat;
    if (sub >= 0) {
      dish.setFeed(dish.getFeed() - countEat);
      this.isWellFed = true;
    } else
      System.out.println(name + " не насытится кормом из миски");
  }

  public void getIsWeelFed() {
    if (isWellFed)
      System.out.println(name + " сытый");
    else
      System.out.println(name + " голодный");
  }
}

/*
  По животным: в классе Animal должно быть два метода - бегать и плавать (плавать - достаточно одного). 
  В нем не должно быть ничего про еду, т.к. ест только кот (у тебя собака это тоже наследует)
*/
