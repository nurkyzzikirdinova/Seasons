import java.util.Scanner;

public class Seasons {
 public void findSeason () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Айдын катарын териниз: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;
            if (monthNumber >= 3 && monthNumber <= 5) {
                season = "жаз";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "жай";
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                season = "куз";
            } else {
                season = "кыш";
            }
            System.out.println(monthNumber + " - катардагы ай " + season + " мезгили.");
        } else {
            System.out.println("Мындай катардагы ай жок.\n"+
                    "Эскертүү: 1ден 12ге чейинки гана сан тандай аласыз.");
        }

    }
}
