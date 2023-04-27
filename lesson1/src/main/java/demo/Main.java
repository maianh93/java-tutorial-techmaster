package demo;


import org.apache.log4j.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        var count = 0;
        while (true) {
            log.debug(count++);
        }

    }
}
