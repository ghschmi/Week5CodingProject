package week5;

// STEP 1 & 2: Logger Interface
public interface Logger {
    void log(String message);
    void error(String message);
}

// STEP 3 & 4: AsteriskLogger Implementation
class AsteriskLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        System.out.println("****************");
        System.out.println("***ERROR: " + message + "***");
        System.out.println("****************");
    }
}

// STEP 3 & 5: SpacedLogger Implementation
class SpacedLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + addSpaces(message));
    }

    private String addSpaces(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedMessage.append(message.charAt(i)).append(" ");
        }
        return spacedMessage.toString();
    }
}

// STEP 6: Main Application
class App {
    public static void main(String[] args) {
        // Instantiate the logger objects
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test the AsteriskLogger methods
        System.out.println("Asterisk Logger Log:");
        asteriskLogger.log("Merry Christmas");
        asteriskLogger.error("Merry Christmas");

        // Test the SpacedLogger methods
        System.out.println("\nSpaced Logger Log:");
        spacedLogger.log("Merry Christmas");
        spacedLogger.error("Merry Christmas");
    }
}