import java.beans.PersistenceDelegate;

public class PersonDemo {
    public static void main(String[] args) {

        // Skapa instanser av klassen person
        Person p1; // p1 är nu en referensvariabel
        p1 = new Person(); // ett objekt skapas

        // Skriv ut objektet
        System.out.println(p1); // hashkod
        System.out.println(p1.firstName); // null
        System.out.println(p1.lastName); // null
        System.out.println(p1.dateOfBirth); // null
        System.out.println(p1.height); // 0.0
        System.out.println(p1.weight); // 0.0

        // Ändra namnet
        p1.firstName = "Ibirocay";
        p1.lastName = "Regueira";

        // Skriv ut hela namnet med hjälp av en metod
        // v1 Denna används om metoden ska användas flera ggr
        String name = Person.getName(p1);
        System.out.println(name);
        // v2 Denna används om man bara ska testa utskriften en gång
        System.out.println(Person.getName(p1));

        // Arbeta med ålder
        p1.dateOfBirth = "1975-06-07";
        Person.getAge(p1);
        System.out.println("Ålder: " + Person.getAge(p1));

        // Arbeta med BMI
        double BMI = Person.getBMI(p1);
        System.out.println(BMI); // NaN
        p1.height = 1.80; // m
        p1.weight = 80; // kg
        System.out.printf("BMI: %.2f \n" , Person.getBMI(p1));

        // Visa viktklassen
        String viktklass = Person.getBMICategory(p1);
        System.out.println("Viktklass: " + viktklass);
    }
}
