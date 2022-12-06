public class Main {
    public static void main(String[] args) {
        task1();
        task3();
    }
    public static void task1() {
        System.out.println("Homework 10");
        //Задание 1 и 2
        String firstName = "Ivan";
        String midlleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + midlleName;
        System.out.println("Задание 1. ФИО сотрудника - " + fullName);
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Задание 2. Данные ФИО сотрудника для заполнения отчета - " + fullNameUp);
    }
    public static void task3() {
        //Задание 3
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Задание 3. Данные ФИО сотрудника - " + fullName.replace("ё", "е"));
    }
}