import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorName(){
        System.out.println(director.toString());
    }

    public void printActors(){
        System.out.println("Список актеров " + "«" + title + "»" + ":");
        for (Actor actor: listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println("__________________________________________");
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)){
            System.out.println("Этот актер уже участвует в представлении.");
            System.out.println("__________________________________________");
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor newActor, String surname) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.surname.equals(surname)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актер с фамилией " + surname + " не участвует в представлении.");
            System.out.println("__________________________________________");
        }
    }

}
