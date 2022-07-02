import java.util.*;

public class L4k10
{
  public static void main(String[] args)
  {
    int numberDays;
    double dailyEarnings, totalEarning;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Podaj liczbę dni z których chcesz zliczyć zarobek.");
    numberDays = keyboard.nextInt();

    totalEarning = 0.0;

    for (int count = 1; count <= numberDays; count++)
    {
      System.out.println("Podaj zarobek z dnia.");
      dailyEarnings = keyboard.nextDouble();

      totalEarning += dailyEarnings;
    }

    System.out.printf("Całkowity zarobek z %d dni to %,.2f złotych.", numberDays, totalEarning);
  }
}
