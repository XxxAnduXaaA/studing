package example;

import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Sergey", 15);
        Schoolar schoolar2 = new Schoolar("Ivan", 14);

        Student student1 = new Student("Anton", 18);
        Student student2 = new Student("Gregory", 20);

        Worker worker1 = new Worker("Michael", 40);
        Worker worker2 = new Worker("Nikolai", 35);

        Team<Schoolar> team1 = new Team<>("SchoolBoys");
        team1.addParticipant(schoolar1);
        team1.addParticipant(schoolar2);

        Team<Student> team2 = new Team<>("RedDragons");
        team2.addParticipant(student1);
        team2.addParticipant(student2);
        //team2.addParticipant(worker2);

        Team<Worker> team3 = new Team<>("WorkingClass");
        team3.addParticipant(worker1);
        team3.addParticipant(worker2);

//        Team<String> team4 = new Team<>("String")

//        team1.playWith(team3);

        Team<Schoolar> anotherSchoolers = new Team<>("CoolBoys");
        Schoolar schoolar3 = new Schoolar("Sofia",13);
        Schoolar schoolar4 = new Schoolar("Ivan",12);
        anotherSchoolers.addParticipant(schoolar3);
        anotherSchoolers.addParticipant(schoolar4);

        team1.playWith(anotherSchoolers);
    }
}
