package org.example.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Logger {
    private static Logger INSTANCE;
    private Logger(){
    }
    public static synchronized Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void classLogg(Object obj, String info){

        System.out.println("Log info: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yy")) + " - " + obj.getClass() + " - " + info );
    }
}
