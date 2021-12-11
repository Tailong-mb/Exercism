public class LogLevels {
    
    public static String message(String logLine) {

        int i = 0;
        String message = "";

      logLine = logLine.replaceAll("[\\n\\r\\t]+", "");

        while(logLine.charAt(i) != ':'){
           i++;
       }
         i++;
        
        while(i < logLine.length()){
                 {
                    message = message + logLine.charAt(i);
                     i++;
                 }
        }
        return message.trim();
    }

    public static String logLevel(String logLine) {
        if(logLine.indexOf("ERROR") != -1)
            return "error";
        else
            if(logLine.indexOf("WARNING") != -1)
            return "warning";
            else
            return "info";
    }

    public static String reformat(String logLine) {
        
        String messageReformat = message(logLine);
        messageReformat = messageReformat + " (" + logLevel(logLine) + ')';

        return messageReformat;
    }
}
