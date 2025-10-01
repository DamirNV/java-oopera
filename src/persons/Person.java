package persons;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;
    protected Double height;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public Double getHeight() {
        return height;
    }

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public Person(String name, String surname, Gender gender, Double height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

}
