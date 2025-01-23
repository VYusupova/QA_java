public class Person {
  private static final String DEFAULT = "-";
  private String name;
  private String position;
  private String email;
  private String phonenumber;
  private Double salary;
  private int age;

  public Person(String _name, String _position, String _email, String _phonenumber, Double _salary, int _age) {
    this.name = _name;
    this.position = _position;
    this.email = _email;
    this.phonenumber = _phonenumber;
    this.salary = _salary;
    this.age = _age;
  }

  public Person(String _name, String _position, String _email, String _phonenumber, Double _salary) {
    this.name = _name;
    this.position = _position;
    this.email = _email;
    this.phonenumber = _phonenumber;
    this.salary = _salary;
    this.age = 0;
  }

  public Person(String _name, String _position, String _email, String _phonenumber) {
    this.name = _name;
    this.position = _position;
    this.email = _email;
    this.phonenumber = _phonenumber;
    this.salary = 0.0;
    this.age = 0;
  }

  public Person(String _name, String _position, String _email) {
    this.name = _name;
    this.position = _position;
    this.email = _email;
    this.phonenumber = DEFAULT;
    this.salary = 0.0;
    this.age = 0;
  }

  public Person(String _name, String _position) {
    this.name = _name;
    this.position = _position;
    this.email = DEFAULT;
    this.phonenumber = DEFAULT;
    this.salary = 0.0;
    this.age = 0;
  }

  public void setName(String _name) {
    this.name = _name;
  }

  public void setPosition(String _position) {
    this.position = _position;
  }

  public void setEmail(String _email) {
    this.email = _email;
  }

  public void setPhonenumber(String _phonenumber) {
    this.phonenumber = _phonenumber;
  }

  public void setSalary(Double _salary) {
    this.salary = _salary;
  }

  public void setAge(int _age) {
    this.age = _age;
  }

  public String getName() {
    return this.name;
  }

  public String getPosition() {
    return this.position;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhonenumber() {
    return phonenumber;
  }

  public Double getSalary() {
    return salary;
  }

  public int getAge() {
    return age;
  }

  public void info() {
    System.out.println("ФИО \t\t" + name);
    System.out.println("Должность \t" + position);
    System.out.println("email \t\t" + email);
    System.out.println("телефон \t" + phonenumber);
    System.out.println("зарплата \t" + salary);
    System.out.println("возраст \t" + age);
    System.out.println("________________________________");
  }

}