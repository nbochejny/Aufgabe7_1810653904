import java.io.File;
import java.io.FileReader;

public class Aufgabe5 {

        public static void main(String args[]) {
            File file = new File("E://file.txt");
            FileReader sucks = new FileReader(file); //Warnt das IOException fehlt, ohne exception kackt es ab
        }

    //Checked werden während dem compilen gechecked => Keine Deklarierung = Fehler beim compilen und kein ergebnis
    //Brauche try-catch oder throw sonst is RIP

    public static void main(String args[])
    {
        int num1=10;
        int num2=0; //Soll nutzer null eingeben und ich habe keine exception drin
        //Durch null teilen geht nicht ! Also arithemticexception nötig
        int erg=num1/num2;
        System.out.println(erg);
    }
    //Unchecked werden nicht während dem compilen gechecked => selbst wenn ich nichts deklariere als exception gibt es keinen comp-Fehler
    //Durch user verursacht da er Dreck eingibt, welchen ich nicht bedacht habe
}
