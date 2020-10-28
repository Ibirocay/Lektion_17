import java.sql.SQLOutput;
import java.util.Calendar;

public class Person {

    // Instansvariabler / field(fält) / Egenskaper / attribut
    String firstName;
    String lastName;
    String dateOfBirth; // YYYY-MM-DD
    double height; // meter
    double weight; // kg

    // Metoder / Operationer / funktioner

    /**
     * En klassmetod som returnerar hela namnet
     * @param p
     * @return
     ***/

    public static String getName(Person p){
     return p.firstName + " " + p.lastName;
    }

    /**
     * getAge är en klassmetod som beräknar ålder
     * @param p  är en referens till ett objekt av typen person
     * @return ålder
     */
    public static int getAge(Person p){
     // Hämta aktuellt år
        String calendar = Calendar.getInstance().getTime().toString();
        System.out.println(calendar);
        String thisYearString = calendar.substring(calendar.lastIndexOf(' ')+1);
        System.out.println(thisYearString);
        int thisYear = Integer.parseInt(thisYearString);
        System.out.println(thisYear);

     // Hämta år från dateOfBirth (1975-06-07)
        String yearString = p.dateOfBirth.substring(0,4);
        int year = Integer.parseInt(yearString);

     // Aktuellt år - år tex. 2020-1973 = 47
        int age = thisYear - year;
    return age;
    }

    /**
     * En klassmetod som beräknar kroppsmassindex
     * @param p är en referensvariabel av typen Person
     * @return
     */
    public static double getBMI(Person p){
      // BMI = Vikt / Längd * Längd
        return p.weight / (p.height*p.height);
    }

    /**
     * En klassmetod som returnerar viktklassen
     * @param p är en person
     * @return viktklassen
     */
    public static String getBMICategory(Person p){
        double BMI = Person.getBMI(p);
        String category;
        if(BMI < 18.5)
            category = "Undervikt";
        else if (BMI < 25)
            category = "Normalvikt";
        else
            category = "Övervikt";

        return category;
    }
}