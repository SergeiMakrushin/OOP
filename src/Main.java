public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.yearOfBirth= 1987;
        maxim.job = "бренд-менеджер";


        Human anna=new Human();
        anna.name="Аня";
        anna.town="Москва";
        anna.yearOfBirth=1993;
        anna.job = "методист образовательных програм";

        Human kate = new Human();
        kate.name = "Катя";
        kate.town = "Калининград";
        kate.yearOfBirth = 1994;
        kate.job = "продакт-менеджер";

        Human artem = new Human();
        artem.name = "Артём";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        artem.job = "директор по развитию бизнеса";

        maxim.Print();
        anna.Print();
        kate.Print();
        artem.Print();


    }
}