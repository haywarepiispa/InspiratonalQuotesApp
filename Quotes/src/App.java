import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalTime nyt = LocalTime.now();
        DateTimeFormatter muoto = DateTimeFormatter.ofPattern("HH:mm:ss");


        System.out.println("ENG: Of course, make your own opinions about these!");
        System.out.println("-");
        System.out.println("FI: Toki, tee omat johtopäätöksesi näistä!");
        System.out.println("-");
        System.out.println("SWE: Självklart, bilda dig din egen uppfattning om dessa!");
        System.out.println("-");
        System.out.println("time a clock, kellonaika, klockan: " + nyt.format(muoto));
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("-");
        System.out.println("Old leaves fall, to be nutrients to fresh leaves.");
        System.out.println("-");
        System.out.println("Vanhat lehdet putoaa, ollakseen ravinteita tuoreille lehdille.");
        System.out.println("-");
        System.out.println("Gamla löv faller, för att bli näring åt nya löv.");
        System.out.println("-");
        System.out.println("time a clock, kellonaika, klockan: " + nyt.format(muoto));
        
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("-");
        System.out.println("Doing an mistake once is reality, but what about doing it twice?");
        System.out.println("-");
        System.out.println("Yhden virheen tekeminen on todellisuutta, mutta entäs sen tekeminen toiste?");
        System.out.println("-");
        System.out.println("Att göra ett misstag en gång är verklighet, men vad händer om man gör det två gånger?");
        System.out.println("-");
        System.out.println("time a clock, kellonaika, klockan: " + nyt.format(muoto));
       
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    
    
    
    
    
    }
}
