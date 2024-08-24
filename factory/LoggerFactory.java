package main.DesignPattern.factory;

public class LoggerFactory {
    public static Logger getLogger(int value){
        if(value==1){
            return new ConsoleLogger();
        }
        else if(value==2){
            return new FileLogger();
        }
        else if(value==3){
            return new DatabaseLogger();
        }

        return null;
    }

    public static Logger getLogger(String value){
        return switch (value) {
            case "console" -> new ConsoleLogger();
            case "file" -> new FileLogger();
            case "database" -> new DatabaseLogger();
            default -> null;
        };

    }

}
