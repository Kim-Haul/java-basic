import org.openjsse.util.RSAKeyUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time {
    public static void main(String[] args) {
        // 현지 시간, 날짜
        System.out.println("---- now usages ----");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        // 특정한 시간, 날짜
        System.out.println("---- of() usages ----");
        LocalDate dateOf = LocalDate.of(2023, 3, 30);
        LocalTime timeOf = LocalTime.of(22, 50, 0);

        System.out.println(dateOf);
        System.out.println(timeOf);

        // 특정한 날짜 포맷 지정
        System.out.println("---- custom format ----");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shortFormat = formatter.format(LocalTime.now());
        System.out.println(shortFormat);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern( "yyyy/MM/dd" );
        String myDate = myFormatter.format(LocalDate.now());
        System.out.println(myDate);

        // 날짜 계산
        System.out.println("---- calculation date ----");
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2022, 9, 1);
        Period period = Period.between(today, birthday);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        
        // 시간 표현 정리
        System.out.println("---- end ----");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern( "yyyy/MM/dd hh:mm" );
        String result = dateFormatter.format(LocalDateTime.now());
        System.out.println("현재 시간 : " + result);
    }
}