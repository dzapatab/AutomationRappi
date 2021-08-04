package utils;

public enum Messages {

    ERROR_CODE("El servicio no responde 200");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}