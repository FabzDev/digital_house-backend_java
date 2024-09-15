import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private static List<String> log;

    private Logger(){
        log = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public void toLog(String logEntry){
        log.add(logEntry);
    }

    public void printLog(){
        for (String entryLog:log){
            System.out.println(TimeFormatted.getTimeFormated() + ": " + entryLog);
        }
    }


}
