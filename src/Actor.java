import java.util.Objects;

public class Actor extends Person{

    public Actor(String name, String surname, Gender gender, Double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                gender == actor.gender &&
                Objects.equals(height, actor.height);
    }
}
