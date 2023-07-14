import java.util.Scanner;

public class Exercises{
	
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Votre kilo:");
int kilo = scanner.nextInt();
System.out.println("Renseigner votre taille : (Ornek : 1,72)");
double taille = scanner.nextDouble();
double bki = kilo/(taille*taille);
System.out.println("Votre Corps-masse index :" + bki);
}

}