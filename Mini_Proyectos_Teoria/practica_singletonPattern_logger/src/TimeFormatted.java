import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatted {
    private static LocalDateTime now = LocalDateTime.now();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static String formattedDate = now.format(formatter);

    public static String getTimeFormated(){
        return formattedDate;
    }
}
