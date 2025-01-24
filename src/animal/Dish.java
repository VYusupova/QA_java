package animal;

public class Dish {
  private int feed;

  public Dish(int _feed) {
    setFeed(_feed);
  }

  public int getFeed() {
    return feed;
  }

  public void setFeed(int _feed) {
    if (_feed < 0)
      System.out.println("Error кол-во еды не может быть отрицательным");
    else
      this.feed = _feed;
  }

  public void addFeed(int _feed) {
    feed += _feed;
  }
}