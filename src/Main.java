public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human maxim = new Human("Максим", "Минск", 1987, "бренд-менеджер");

        Human anna = new Human("Аня", "Москва", -5, "методист образовательных програм");

        Human kate = new Human("Катя", "Калининград", 1994, "продакт-менеджер");

        Human artem = new Human("Артём", null, 1995, "директор по развитию бизнеса");

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);


    }
}
