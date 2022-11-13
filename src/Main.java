import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String urok = a.nextLine();
        switch (urok) {
            case "Понедельник":
                System.out.println("Алгебра");
                break;
            case "Вторик":
                System.out.println("География");
                break;
            case "Среда":
                System.out.println("Физкультура");
                break;
            case "Четверк":
                System.out.println("Биология");
                break;
            case "Пятница":
                System.out.println("Информатика");
                break;
            default:
                System.out.println("в этот день мы отдыхаем");


        }
    }
}