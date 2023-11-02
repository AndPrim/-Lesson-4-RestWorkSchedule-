import ru.netology.services.RestWorkSchedule.services.CalcOfMonthsOfRest;

public class Main {

    public static void main(String[] args) {
        CalcOfMonthsOfRest service = new CalcOfMonthsOfRest();
        int threshold = 0;
        int expenses = 0;
        int income = 0;
        System.out.println(service.calcMonthRest(income, expenses, threshold));
    }
}
