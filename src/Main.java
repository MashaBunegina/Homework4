import java.sql.SQLOutput;

public class Main {
    //Задача 1
    public static void main(String[] args) {
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println(" Поздравляю с совершеннолетием");
        } else {
            System.out.println(" возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        // Задача 2
        int age = 7;
        if (age >= 7 && age < 18) {
            System.out.println("ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println(" Человек ходит в университет");
        } else if (age >= 24) {
            System.out.println("Человек ходит на работу");
        }

        // Домашнее задание - 3, задание 1
        int yearsOld = 3;
        if (yearsOld >= 2 && yearsOld < 6) {
            System.out.println("Если человеку " + yearsOld + "  то ему нужно ходить в детский сад");
        } else if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Если человеку " + yearsOld + "  то ему нужно ходить в школу");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Если человеку " + yearsOld + " то его место в университете");
        } else if (yearsOld > 24) {
            System.out.println("Если человеку" + yearsOld + ", то ему нужно ходить на работу");
        }

        // Задание 2

        int ages = 8;
        boolean canNotRideRides = ages < 5;
        if (canNotRideRides) {
            System.out.println(" Ты недостаточно взрослый, чтобы кататься на аттракционе");
        } else if (ages < 14) {
            System.out.println(" ты можешь кататься в сопровождении взрослого");
        } else if (ages >= 14) {
            System.out.println(" ты можешь кататься без сопровождения взрослого");
        }

        //Задача 3.

        int allTrainPlace = 102;
        int seatPlace = 60;
        int standingPlace = allTrainPlace - seatPlace;

        int seatPlaceTaken = 59;
        int standingPlaceTaken = 28;
        if (seatPlaceTaken < seatPlace) {
            System.out.println("Есть еще " + (seatPlace - seatPlaceTaken) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }

        if (standingPlaceTaken < standingPlace) {
            System.out.println("Есть еще " + (standingPlace - standingPlaceTaken) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }

        // Задание 3
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
        }  else if (one > three) {
                System.out.println("Максимальное число -" + one);
            } else if (three > one) {
                System.out.println("Максимальное число -" + three);
            } else {
                System.out.println("Числа " + one + " и " + three + "равны");
            }
            if (two > one)
                if (two > three) {
                    System.out.println("Максимальное число - " + two);
                } else if (three > two) {
                    System.out.println("Максимальное число - " + three);
                } else {
                    System.out.println("Числа" + two + "и" + three + "равны");
                }
            else {
                if (one > three) {
                    System.out.println("Максимальное число" + one);
                } else if (three > one) {
                    System.out.println("Максимально число" + three);
                } else {
                    System.out.println(" Все числа равны");
                }
            }
        }
    }






