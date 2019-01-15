import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3 {
    public static void main(String[]args){
        String email = JOptionPane.showInputDialog("Give email");
        try {
            testEmail(email);
        } catch (WrongEmailException e) {
            e.printStackTrace();
        }
    }


    private static void testEmail(String email) throws WrongEmailException{

        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
        Matcher m = pattern.matcher(email);

        if (!m.find()) throw new WrongEmailException(); //! logisches nicht eigene exception wird gethrowt
    }
}
