package homeworktocheck.hw006pro.task003;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculateDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Сегодня: " + currentDate);
        LocalDate myBirthDay = LocalDate.of(1984, 11, 9);
        System.out.println("День рождения: " + myBirthDay);
        Period p = Period.between(myBirthDay, currentDate);
        long period = ChronoUnit.DAYS.between(myBirthDay, currentDate);
        System.out.println("Со дня рождения до текущей даты прошло: " + p.getYears() + " лет, " + p.getMonths() + " месяцев и " + p.getDays() + " дней.");
    }
}