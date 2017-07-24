package koushik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Filtering {
    boolean filter(Player player);
}

/**
 * Created by Adwiti on 7/23/2017.
 */
public class FilteringInJava8 {

    public static void main(String[] args) {
        List<Player> players = Arrays.asList(new Player("Arun", "singh", 40000), new Player("Sachin", "tendulkar", 50000), new Player("Rahul", "Dravid", 60000));
        List<Player> lstOfPlayersWhoseNameStartsWithA = printPlayers(players, p -> p.getFirstName().startsWith("A"));
        System.out.println(lstOfPlayersWhoseNameStartsWithA);
        List<Player> lstOfPlayerWithSalaryMoreThan50000 = printPlayers(players, p -> p.getSalary()>50000);
        System.out.println(lstOfPlayerWithSalaryMoreThan50000);

    }

    public static List<Player> printPlayers(List<Player> lstPlayer, Filtering condition) {

        List<Player> returnFilteredPlayer = new ArrayList<>();
        for (Player player : lstPlayer) {
            if (condition.filter(player)) {
                returnFilteredPlayer.add(player);
            }
        }
        return returnFilteredPlayer;
    }
}

class Player {
    private String firstName;
    private String lastName;
    private Integer salary;

    public Player(String firstName, String lastName, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
