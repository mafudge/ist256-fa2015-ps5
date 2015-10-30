package baseball;

/**
 *
 * @author mafudge
 */
public class PlayerSalary {

    private final int year;
    private final String teamName;
    private final String league;
    private final String playerName;
    private final double salary;
    
    /**
     * Make a new  Baseball player salary object to hold basic info about the player and their salary.
     * @param year
     * @param teamName
     * @param league
     * @param playerName
     * @param salary 
     */
    public PlayerSalary(int year, String teamName, String league, String playerName, double salary) {
        this.year = year;
        this.teamName = teamName;
        this.league = league;
        this.playerName = playerName;
        this.salary = salary;        
    }
    
    /**
     * Gets the player's year
     * @return year as int
     */
    public int Year() {
        return this.year;
    }
    
    /**
     * gets the player's team name
     * @return team name as string 
     */
    public String TeamName() {
        return this.teamName;
    }
    
    /**
     * Gets the player's league
     * @return  league name as string
     */
    public String League() {
        return this.league;
    }
    
    /**
     * Gets the player's name
     * @return name as string 
     */
    public String playerName() {
        return this.playerName;
    }
    
    /**
     * Gets the player's salary
     * @return salary as an double
     */
    public double Salary() {
        return this.salary;
    }
    
}
