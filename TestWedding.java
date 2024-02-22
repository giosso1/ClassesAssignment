import javax.swing.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestWedding {
    public static void main(String[] args){
        Person p1, p2;
        LocalDate d;

        String input = JOptionPane.showInputDialog("What is the first and last name of the bride");
        if(input.contains(" ")) p1 = new Person(input.split(" ")[0], input.split(" ")[1]);
        else p1 = new Person(input);
        input = JOptionPane.showInputDialog("What is the first and last name of the groom");
        if(input.contains(" ")) p2 = new Person(input.split(" ")[0], input.split(" ")[1]);
        else p2 = new Person(input);


        input = JOptionPane.showInputDialog("Enter the date in the form: yyyy/mm/dd");
        try{
            d = LocalDate.of(Integer.parseInt(input.split("/")[0]), Integer.parseInt(input.split("/")[1]), Integer.parseInt(input.split("/")[2]));
        }
        catch(Exception e){
            input = JOptionPane.showInputDialog("Please enter the date in the form: yyyy/mm/dd");
            d = LocalDate.of(Integer.parseInt(input.split("/")[0]), Integer.parseInt(input.split("/")[1]), Integer.parseInt(input.split("/")[2]));
        }

        String l = JOptionPane.showInputDialog("Where is the wedding taking place");

        Wedding w = new Wedding(new Couple(p1, p2), d, l);

        JOptionPane.showMessageDialog(null, w.invite());
        JOptionPane.showMessageDialog(null, "There are "+ChronoUnit.DAYS.between(LocalDate.now(), d)+" days until the wedding");
    }
}
