package org.example.singleton;

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

    public void writeInfo(String info, Class cl){
        System.out.println("log info: " + info + " " + cl.getName());
    }
}
