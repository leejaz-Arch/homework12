//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);


        System.out.println("Задание №2");

        String firstName1 = "Ivan";
        String middleName1 = "Ivanovich";
        String lastName1 = "Ivanov";
        String fullName1 = lastName1 + " " + firstName1 + " " + middleName1;

        String fullNameUpper = fullName1.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpper);


        System.out.println("Задание №3");

        String fullName2 = "Иванов Семён Семёнович";

        String fullNameFixed = fullName2.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameFixed);

    }
}