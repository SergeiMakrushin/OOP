import java.time.LocalDate;

public class Human {

    String name;
    private String town;
    private int yearOfBirth;
    String job;
    //int age;

    Human(String name, String town, int yearOfBirth, String job) {

        this.setName(name);
        this.setTown(town);

        this.setJob(job);
       this.setYearOfBirth(yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            this.name = ": Информация не указана";
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || !town.isEmpty() || !town.isBlank()) {
            this.town = town;
        } else {
            this.town = ": Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job != null || !job.isEmpty() || !job.isBlank()) {
            this.job = job;
        } else {
            this.job = ": Информация не указана";
        }
    }
    // public void setAge(int age) {
    //   this.age = age;
    //}

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности: " + job + ". Будем знакомы!";
    }

}
