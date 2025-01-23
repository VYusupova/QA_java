
public class Main {
  public static void main(String[] args) {
    Person[] persArray = new Person[5];
    persArray[0] = new Person("Иванов Иван Иванович", "Директор", "tzirw@example.com", "8-800-555-35-35", 100000.0, 50);
    persArray[1] = new Person("Петров Петр Петрович", "Инженер", "tugrp@example.com", "8-800-555-35-35", 50000.0);
    persArray[2] = new Person("Сидоров Сидр Сидорович", "Специалист", "tugrp@example.com", "8-800-555-35-35");
    persArray[3] = new Person("Кузнецов Кузнец", "дворник", "tugrp@example.com");
    persArray[4] = new Person("Смирнов Смирнович", "сторож");
    for (int i = 0; i < 5; i++)
      persArray[i].info();
    // создали парк на 1 аттракцион и добавляем 2 аттракциона
    // на втором получаем ошибку
    System.out.println("\tTEST_1 - добавление больше чем можно \n ");
    Park park = new Park(1);
    park.addAttraction("Чертовое колесо", "10:00 - 15:00", 250.0);
    park.addAttraction("Батут", "9:00 - 17:00", 50.0); // Error park if full
    park.info();

    System.out.println("\tTEST_2 - делаем замену аттракциона \n");
    Park park2 = new Park(2);
    park2.addAttraction("Лабиринт", "9:00 - 17:00", 50.0);
    park2.addAttraction("Карусель", "9:00 - 17:00", 150.0);
    park2.info();
    System.out.println("\t\t делаем замену аттракциона");
    park2.addAttraction(0, "Зеркальный лабиринт", "11:00 - 13:00", 350.0);
    park2.info();

    System.out.println("\tTEST_3 - проверяем вывод с пустыми аттракционами \n");
    Park park3 = new Park(3);
    park3.addAttraction("Автодром", "9:00 - 17:00", 250.0);
    park3.addAttraction("Паравозик", "9:00 - 17:00", 150.0);
    park3.addAttraction("Тир", "15:00 - 17:00", 100.0);
    park3.info();
    System.out.println("\t\t deleted");
    park3.remove(1);
    park3.info();

    System.out.println("\tTEST_4 - удаление по имени \n");
    Park park4 = new Park(4);
    park4.addAttraction("Башня", "18:00 - 20:00", 1250.0);
    park4.addAttraction("Комнта страха", "17:00 - 23:00", 550.0);
    park4.addAttraction("Горки", "11:00 - 15:00", 1100.0);
    park4.addAttraction("Музеи", "09:00 - 17:00", 100.0);
    park4.info();
    System.out.println("\t\t deleted");
    park4.remove("Горки");
    park4.info();

    System.out.println("\tTEST_5 - переименовать аттракцион по  имени \n");
    Park park5 = new Park(5);
    park5.addAttraction("карусель с лошадками", "8:00 - 20:00", 50.0);
    park5.addAttraction("Карусель с машинками", "9:00 - 23:00", 60.0);
    park5.addAttraction("Паровозик гусеничка", "10:00 - 15:00", 70.0);
    park5.addAttraction("Музей динозавров", "11:00 - 17:00", 80.0);
    park5.addAttraction("Музей уродцев", "12:00 - 17:00", 90.0);
    park5.info();
    System.out.println("\t\t rename");
    park5.rename("Паровозик гусеничка", "Американские горки");
    park5.info();
  }

}