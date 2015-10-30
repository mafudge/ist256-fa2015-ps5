/**
 * BEFORE YOU BEGIN:
 * I strongly suggest reading the assignment document carefully, then reading 
 * all of the code and comments in this file prior to starting the assignment.
 */
package baseball;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Your-Name-And-Email-Here
 */
public class SalaryDatabaseRun {

    /**
     * In this main program loop, you should:
     * load the datafile "baseball-player-salaries-full.csv" into the arraylist
     * repeat the following:
     *    display the menu, ask for input
     *    when input is "t":
     *      ask for a player's name / print the salary history for the player
     *    when input is "t":
     *      ask for a team name & year / print the player's salaries for the team / year
     *    when input is "q":
     *      quit the program
     *    
     * @param args
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

    }
    
    /**
     * This method will print to the console the salary history of a team
     * for a given year.  for a given player.
     * For each item in the array list where the team name / year matches it should
     * print the PLAYER and SALARY  making a list.
     * As a summary, it should print the teams total salary for that year and
     * and the teams average salary.
     * Here's an example output for the "Baltimore Orioles" in 2006"
     * 
     * Salary history for the Baltimore Orioles in 2006
     * PLAYER                     SALARY
     * Brian Roberts        $    3075000.00
     * Nick Markakis        $     327000.00
     * Luis Matos           $    1625000.00
     * Kevin Millar         $    2100000.00
     * Melvin Mora          $    4333334.00
     * David Newhan         $     550000.00
     * John Parrish         $     612500.00
     * Corey Patterson      $    2800000.00
     * Aaron Rakers         $     327000.00
     * Miguel Tejada        $   11811415.00
     * Sendy Rleal          $     327000.00
     * Todd Williams        $     775000.00
     * Rodrigo Lopez        $    3750000.00
     * Chris Ray            $     335000.00
     * Daniel Cabrera       $     385000.00
     * Kris Benson          $    8333333.00
     * Javy Lopez           $    9000000.00
     * Erik Bedard          $    1400000.00
     * Tim Byrdak           $     335000.00
     * Raul Chavez          $     400000.00
     * Bruce Chen           $    3800000.00
     * Jeff Conine          $    1700000.00
     * Eric DuBose          $     334000.00
     * Jay Gibbons          $    4200000.00
     * Chris Gomez          $     850000.00
     * LaTroy Hawkins       $    4400000.00
     * Ramon Hernandez      $    4000000.00
     * Jim Brower           $     700000.00 
     * Team's Total Salary in 2006 : $72585582.00
     * Team's Avg Salary in 2006   : $2592342.21
     * 
     * @param pl The ArrayList of PlayerSalary
     * @param teamName the baseball team name
     * @param year the year 
     */
    public static void PrintSalaryHistoryForTeamAndYear(ArrayList<PlayerSalary> pl, String teamName, int year) {
        // TODO: Write your code here

    }

    /**
     * This method will print to the console the salary history for a given player.
     * For each item in the array list where the player's name matches, it should
     * print the YEAR TEAM and SALARY  making a list of each year / team 
     * for which the player has played.
     * As a summary, it should print the total number of years the player 
     * has played professional baseball and the total player's salary. 
     * Here's an example output for playerName = "Matt Garza"
     *
     * Salary history for Matt Garza
     * YEAR TEAM                      SALARY
     * 2008 Tampa Bay Rays       $   404600.00
     * 2009 Tampa Bay Rays       $   433300.00
     * 2010 Tampa Bay Rays       $  3350000.00
     * 2011 Chicago Cubs         $  5950000.00
     * 2012 Chicago Cubs         $  9500000.00
     * 2013 Chicago White Sox    $ 10250000.00
     * 2014 Milwaukee Brewers    $ 12500000.00
     * Years Pro : 7
     * Player's Total Salary :   $ 42387900.00
     * 
     * @param pl The ArrayList of PlayerSalary
     * @param playerName the player's name 
     */
    public static void PrintSalaryHistoryForPlayer(ArrayList<PlayerSalary> pl, String playerName) {
        // TODO: Write your code here

    }

    /**
     * This method will print the menu to the console. The menu should appear like this:
     * 
     * **** Baseball Salary Database Main Menu****
     * p = Display Salary History for a given player name.
     * t = Display Salary History for a given team & year.
     * q = Quit.
     * 
     */
    public static void PrintMenu() {
        //TODO: Write code here.

    }
            
    /**
     * Reads from the csvFileName and loads the data in-memory into an ArrayList of PlayerSalary
     * The method has been written for you and should work fine provided you call it properly.     
     * @param csvFilename The name of the comma-separate values file to read from 
     * @return an Arraylist of PlayerSalary
     * @throws FileNotFoundException 
     */
    public static ArrayList<PlayerSalary> LoadPlayerSalariesFromCsvFile( String csvFilename ) throws FileNotFoundException {
        File playerFile = new File(csvFilename);  
        Scanner file = new Scanner(playerFile);        
        ArrayList<PlayerSalary> pl = new ArrayList();        
        while (file.hasNextLine()) {                        // for each line in the file
            String[] fields = file.nextLine().split(",");   // split the line on "," into an array
            int year = Integer.parseInt(fields[0]);         // send each array value into a variable (year, team, etc.)
            String team = fields[1];                        
            String league = fields[2];
            String player = fields[3];
            double salary = Double.parseDouble(fields[4]);

            PlayerSalary newPlayer = new PlayerSalary(year, team, league, player, salary);  // construct the object
            pl.add(newPlayer);                                                              // add the player to the list
        }       
        return pl;
    }
        
}
