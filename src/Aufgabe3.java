import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3 {
    public static void main(String[]args){

        try {
            if (testEmail()) {
                System.out.println("Valid");
            } else {
                System.out.println("Trash");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static boolean testEmail() throws Exception {
        String email = JOptionPane.showInputDialog("Give email");

        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
        Matcher m = pattern.matcher(email);

        return m.find();
    }
}
