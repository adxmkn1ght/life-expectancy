package life.expectancy;

import java.util.*;

public class LifeExpectancy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This is an estimate and won't be 100% reliable");
        System.out.println("What year were you born in? (YYYY)");
        int yearbirth = input.nextInt();
        System.out.println("What month were you born in? (MM)");
        int monthbirth = input.nextInt();
        System.out.println("What day were you born on? (DD)");
        int daybirth = input.nextInt();
        System.out.println("What is the year now? (YYYY)");
        int yearcurrent = input.nextInt();
        System.out.println("What is the month now? (MM)");
        int monthcurrent = input.nextInt();
        System.out.println("What is the day now? (DD)");
        int daycurrent = input.nextInt();
        System.out.println("What is the time now? (hours)");
        int hourscurrent = input.nextInt();
        System.out.println("What is the time now? (minutes)");
        int minutescurrent = input.nextInt();

        int yeardifference = yearcurrent - yearbirth;
        int monthdifference = (yeardifference * 12) + (monthcurrent - monthbirth);
        int daydifference = (monthdifference * 30) + (daycurrent - daybirth);
        int hoursdifference = (daydifference * 24) + hourscurrent;
        int minutesdifference = (hoursdifference * 60) + minutescurrent;
        int secondsdifference = minutesdifference * 60;

        System.out.println("You have been alive " + yeardifference + " years");
        System.out.println("You have been alive " + monthdifference + " months");
        System.out.println("You have been alive " + daydifference + " days");
        System.out.println("You have been alive " + hoursdifference + " hours");
        System.out.println("You have been alive " + minutesdifference + " minutes");
        System.out.println("You have been alive " + secondsdifference + " seconds");

        System.out.println("Do you smoke? (1 for yes 2 for no)");
        int smoke = input.nextInt();
        System.out.println("Do you exercise regularly? (1 for yes 2 for no)");
        int exercise = input.nextInt();
        System.out.println("Do you have a healthy diet? (1 for yes 2 for no)");
        int diet = input.nextInt();
        System.out.println("Are you socially active / have lots of friends? (1 for yes 2 for no)");
        int social = input.nextInt();
        System.out.println("Do you drink alcohol in vast amounts? (1 for yes 2 for no)");
        int alcohol = input.nextInt();

        int deathseconds = (71 * 12 * 30 * 24 * 60 * 60) - secondsdifference;

        if (smoke == 1) {
            deathseconds = deathseconds - (10 * 12 * 30 * 24 * 60 * 60);
        }
        if (exercise == 1) {
            deathseconds = deathseconds + (7 * 12 * 30 * 24 * 60 * 60);
        }if(diet == 1){
            deathseconds = deathseconds + (4 * 12 * 30 * 24 * 60 * 60);
        }if(social == 1){
            deathseconds = deathseconds + (1 * 12 * 30 * 24 * 60 * 60);
        }if(alcohol == 1){
            deathseconds = deathseconds - (6 * 12 * 30 * 24 * 60 * 60);
        }
        int deathminutes = deathseconds / 60;
        int deathhours = deathminutes / 60;
        int deathdays = deathhours / 24;
        int deathmonths = deathdays / 30;
        int deathyears = deathmonths / 12;

        System.out.println("You will die in " + deathyears + " years");
        System.out.println("You will die in " + deathmonths + " months");
        System.out.println("You will die in " + deathdays + " days");
        System.out.println("You will die in " + deathhours + " hours");
        System.out.println("You will die in " + deathminutes + " minutes");
        System.out.println("You will die in " + deathseconds + " seconds");

    }

}
