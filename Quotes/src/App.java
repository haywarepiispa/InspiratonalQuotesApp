import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // calls Scanner
        Scanner in = new Scanner(System.in);
        
        // calls LocalTime and DateTimeFormatter
        LocalTime nyt = LocalTime.now();
        DateTimeFormatter muoto = DateTimeFormatter.ofPattern("HH:mm:ss");

        // prints welcoming disclaimer + time
        System.out.println("ENG: Of course, make your own opinions about these!");
        System.out.println("-");
        System.out.println("FI: Toki, tee omat johtopäätöksesi näistä!");
        System.out.println("-");
        System.out.println("SWE: Självklart, bilda dig din egen uppfattning om dessa!");
        System.out.println("-");
        System.out.println("time a clock, kellonaika, klockan: " + nyt.format(muoto));
        
        // pause nr.1
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // prints first quote + time
        System.out.println("-");
        System.out.println("Old leaves fall, to be nutrients to fresh leaves.");
        System.out.println("-");
        System.out.println("Vanhat lehdet putoaa, ollakseen ravinteita tuoreille lehdille.");
        System.out.println("-");
        System.out.println("Gamla löv faller, för att bli näring åt nya löv.");
        System.out.println("-");
        System.out.println("time a clock, kellonaika, klockan: " + nyt.format(muoto));
        
        // pause nr.2
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // prints second quote + time
        System.out.println("-");
        System.out.println("Doing an mistake once is reality, but what about doing it twice?");
        System.out.println("-");
        System.out.println("Yhden virheen tekeminen on todellisuutta, mutta entäs sen tekeminen toiste?");
        System.out.println("-");
        System.out.println("Att göra ett misstag en gång är verklighet, men vad händer om man gör det två gånger?");
        System.out.println("-");
        System.out.println("time a clock, kellonaika, klockan: " + nyt.format(muoto));
       
        // pause nr.3
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // prints third quote + time
        System.out.println("-");
        System.out.println("Even Rome wasn't built in a day, why shoud your life be?");
        System.out.println("-");
        System.out.println("Edes Roomaa ei rakennettu päivässä, miksi sinun elämäsi pitäisi olla?");
        System.out.println("-");
        System.out.println("Inte ens Rom byggdes på en dag, så varför skulle ditt liv göra det?");
        System.out.println("-");
        System.out.println("time a clock, kellonaika, klockan: " + nyt.format(muoto));
    
        // pause nr.4
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // asks feedback + gives instructions + takes user input
        System.out.println("Give feedback if you want (in english preferably). Thank you for using! (just press enter if you dont want to give feedback.)");
        String input = in.nextLine();
        
        // if user doesnt answer anything, return
       if (input == "") {
        return;
       
        // if user does answer anything, print
        } else {
        System.out.println("Your input = " + input + "   - Thank you for your feedback");
       }
    
    
    }   // end of main
}
