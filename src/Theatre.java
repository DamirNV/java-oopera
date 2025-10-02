import shows.*;
import persons.*;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor jackieChan = new Actor("Джеки", "Чан", Gender.MALE, 1.74);
        Actor arnoldSchwarzenegger = new Actor("Арнольд", "Шварценеггер", Gender.MALE, 1.88);
        Actor lyubovAksyonova = new Actor("Любовь", "Аксёнова", Gender.FEMALE, 1.75);

        Director stevenSpielberg = new Director("Стивен", "Спилберг", Gender.MALE, 12);
        Director christopherNolan = new Director("Кристофер", "Нолан", Gender.MALE, 5);

        Person hansZimmer = new Person("Ханс", "Циммер", Gender.MALE);
        Person crystalPite = new Person("Кристал", "Пит", Gender.MALE);

        String operaLibrettoText = """
                ОПЕРА «ДОВОД» 
                
                ДЖЕКИ ЧАН (тенор, двигаясь в обратной хореографии):
                Пули летят в ствол, время - вспять,
                Бой начинается с финала!
                Я из завтрашнего дня пришёл,
                Чтоб настоящее спасти!
                
                АКСЕНОВА (сопрано, грациозно против течения времени):
                Ты мой парадокс, мой довод,
                Что опроверг все законы!
                Любовь, что родилась в конце,
                В начале уже была!
                
                ДУЭТ (в временной петле):
                Мы встретились в точке сингулярности,
                Где "после" стало "до",
                И поцелуй в обратном времени
                Создал любовь из ничего!
                __________________________________________
                """;


        String baletLibrettoText = """
                БАЛЕТ «ЛЕБЕДИНОЕ ОЗЕРО»
                
                ШВАРЦНЕГГЕР (мощно):
                Озеро спит в лунной мгле,
                Но в сердце буря и борьба!
                Я сокрушу колдовские сети,
                Освобождая лебединый дух!
                
                АКСЕНОВА (грациозно):
                Белое перо - моя темница,
                Лунный свет - мои оковы!
                Жду воина, чья сила духа
                Растопит лёд в моей груди!
                __________________________________________
                """;

        Show show = new Show("Терминатор", 120, stevenSpielberg, new ArrayList<Actor>());
        Opera opera = new Opera("Довод", 137, christopherNolan, new ArrayList<Actor>(), hansZimmer,
                operaLibrettoText, 13);
        Ballet ballet = new Ballet("Лебединое озеро", 150, stevenSpielberg, new ArrayList<Actor>(),
                hansZimmer, baletLibrettoText, crystalPite);

        show.addActor(jackieChan);
        show.addActor(arnoldSchwarzenegger);

        opera.addActor(jackieChan);
        opera.addActor(arnoldSchwarzenegger);

        ballet.addActor(arnoldSchwarzenegger);
        ballet.addActor(lyubovAksyonova);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        opera.changeActor(lyubovAksyonova, "Шварценеггер");
        opera.printActors();

        ballet.changeActor(jackieChan, "Иванов");

        opera.printLibrettoText();
        ballet.printLibrettoText();

    }
}

