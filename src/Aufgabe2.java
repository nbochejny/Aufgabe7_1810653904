import javax.swing.*;

public class Aufgabe2 {
    public static void main(String[]args){

        num();
    }

    public static void num(){
        try {
            Integer.parseInt(JOptionPane.showInputDialog("Give number !"));
        } catch (NumberFormatException e){
            System.err.println("You messed up");
            num();
        }
    }
}
