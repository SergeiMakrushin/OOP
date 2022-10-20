public class Human {

    String name;
    String town;
    int yearOfBirth;
    String job;

    Human(String name, String town, int yearOfBirth, String job) {

        if (name == "" || name == null) {
            this.name = ": Информация не указана";
        } else {
            this.name = name;
        }
        if (town == "" || town == null) {
            this.town = ": Информация не указана";
        } else {
            this.town = town;
        }
        if (job == "" || job == null) {
            this.job = ": Информация не указана";
        } else {
            this.job = name;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }


    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }

}
