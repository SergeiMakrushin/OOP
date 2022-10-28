public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human maxim = new Human("Максим", "Минск", 1987, "бренд-менеджер");

        Human anna = new Human("Аня", "Москва", 1999, "методист образовательных програм");

        Human kate = new Human("Катя", "Калининград", 1994, "продакт-менеджер");

        Human artem = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");

        Human vladimir = new Human("Владимир", "Казань", 2001, "нигде не работает");

        maxim.setTown("moscow");
        maxim.setYearOfBirth(37);

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println( vladimir);


        Flower roza = new Flower("Роза обыкновенная", "", "Голандии", 35.59, 0);
        Flower hrizantema = new Flower("Хризантема", "", "", 15, 5);
        Flower pion = new Flower("Пион", "", "Англии", 69.9, 1);
        Flower gipsofila = new Flower("Гипсофила", "", "Турции", 19.5, 10);
        System.out.println(roza);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsofila);


    }
}
//Хризантема, стоимость штуки — 15 рублей, срок стояния — 5 дней.
       // Пион из Англии, стоимость штуки — 69,9 рублей, срок стояния — 1 день.
        //Гипсофила, страна происхождения — Турция, стоимость штуки — 19,5 рублей, срок стояния — 10 дней.