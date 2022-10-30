import java.util.Scanner;

public class Ochroniarz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Jak masz na imię?");
        String firstName=sc.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String lastName=sc.nextLine();
        System.out.println("Gdzie mieszkasz?");
        String city=sc.nextLine();
        System.out.println("Ile masz lat?");
        int age=sc.nextInt();
        System.out.println("Jaki jest twój stan cywiny? Jeżli wolny/ zajęty to wpisz: (true/false):");
        boolean stanCywilny= sc.nextBoolean();

        System.out.println(firstName +" "+lastName+" "+"Mam "+age+" lat"+" mieszkam w "+city+"Jestem wolny=true, zajęty =false: "+stanCywilny);
    }
}
