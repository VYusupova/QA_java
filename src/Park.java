public class Park {
  private int countAttraction;
  private int lastRefAttraction;
  private Attraction[] attraction;

  Park(int _countAttraction) {
    this.countAttraction = _countAttraction;
    attraction = new Attraction[countAttraction];
    lastRefAttraction = 0;
  }

  public void addAttraction(String _name, String _time, Double _price) {
    if (lastRefAttraction < countAttraction) {
      attraction[lastRefAttraction] = new Attraction(_name, _time, _price);
      lastRefAttraction++;
    } else
      System.out.println("ERROR - park is full");
  }

  public void addAttraction(int index, String _name, String _time, Double _price) {
    if (index < 0 || index > countAttraction)
      System.out.println("ERROR - index not correct");
    else {
      attraction[index] = new Attraction(_name, _time, _price);
    }
  }

  public void remove(int index) {
    if (index < 0 || index > countAttraction)
      System.out.println("ERROR - index not correct");
    else {
      for (int i = index; i + 1 < lastRefAttraction; i++)
        attraction[i] = attraction[i + 1];
      lastRefAttraction--;
      attraction[lastRefAttraction] = null;
    }
  }

  public void remove(String _name) {
    for (int i = 0; i < this.countAttraction; i++)
      if (this.attraction[i] != null && this.attraction[i].getName().equals(_name))
        this.remove(i);
  }

  public int size() {
    return countAttraction;
  }

  public void rename(String oldName, String newName) {
    for (int i = 0; i < this.lastRefAttraction; i++)
      if (this.attraction[i].getName().equals(oldName))
        this.attraction[i].setName(newName);
  }

  public void rename(int index, String newName) {
    if (index < 0 || index > countAttraction)
      System.out.println("ERROR - index not correct");
    else if (this.attraction[index] == null)
      System.out.println("ERROR - element of index not found");
    else
      this.attraction[index].setName(newName);
  }

  public void getAttractionInfo(int index) {
    attraction[index].info();
  }

  public void info() {
    System.out.println("парк расчитан на \t" + size() + " Аттракциона");
    System.out.println("сейчас в парке \t" + lastRefAttraction + " Аттракциона");
    System.out.println("инфо о каждом аттракционе: \t\t");
    for (int i = 0; i < lastRefAttraction; i++)
      if (this.attraction[i] != null)
        this.attraction[i].info();
      else
        System.out.println("attraction index " + i + " is null:");
  }

  class Attraction {
    private String name;
    private String time;
    private Double price;

    private Attraction(String _name, String _time, Double _price) {
      this.name = _name;
      this.time = _time;
      this.price = _price;
    }

    private void setName(String _name) {
      this.name = _name;
    }

    private String getName() {
      return this.name;
    }

    private void info() {
      System.out.println("________________________________");
      System.out.println("Аттракцион \t\t" + name);
      System.out.println("время работы \t" + time);
      System.out.println("Стоимость \t\t" + price);
      System.out.println("________________________________");
    }
  }
}
