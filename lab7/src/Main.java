import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Толстой");
        people.add("Булгаков");
        people.add("Фет");
        people.add("Пушкин");
        for (String person : people) {
            System.out.println(person);
        }
        System.out.println();
        people.add(1, "Булычев"); // добавляем элемент по индексу 1
        for (String person : people) {

            System.out.println(person);
        }
        System.out.println();
        System.out.println("Вывод по индексу 1");
        System.out.println(people.get(1));// получаем 2-й объект
        System.out.println();
        System.out.println("Меняем 1 элемент на черный");
        people.set(1, "Черный"); // установка нового значения для 2-го объекта
        for (String person : people) {

            System.out.println(person);
        }
        System.out.println();
        System.out.printf("ArrayList имеет %d элементов \n", people.size());
        System.out.println();
        // проверяем наличие элемента
        if (people.contains("Толстой")) {

            System.out.println("ArrayList содержит Толстой");
        }
        System.out.println();
        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Фет");
        System.out.println("Удаляем Фет");
        for (String person : people) {

            System.out.println(person);
        }
        // удаление по индексу
        people.remove(0);
        System.out.println("Удаляем значение по индексу 0");
        for (String person : people) {

            System.out.println(person);
        }
        System.out.println("Как объект");
        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {

            System.out.println(person);
        }
    }
}