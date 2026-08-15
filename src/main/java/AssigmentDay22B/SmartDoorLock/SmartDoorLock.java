package AssigmentDay22B.SmartDoorLock;

public class SmartDoorLock {

    private String pinCode;
    private boolean isLocked;
    private int failedAttempts;
    private boolean isBlocked;

    private boolean isValidPin(String pin) {

        if (pin == null || pin.length() != 4) {
            return false;
        }

        for (int i = 0; i < pin.length(); i++) {

            char currentChar = pin.charAt(i);

            if (currentChar < '0' || currentChar > '9') {
                return false;
            }
        }

        return true;
    }


    public SmartDoorLock(String pinCode) {

        if (isValidPin(pinCode)) {
            this.pinCode = pinCode;
        } else {
            this.pinCode = "0000";
        }

        this.isLocked = true;
        this.failedAttempts = 0;
        this.isBlocked = false;
    }


    public boolean isLocked() {
        return isLocked;
    }


    public boolean isBlocked() {
        return isBlocked;
    }

    public boolean unlock(String pin) {

        if (isBlocked == true) {
            return false;
        }

        if (pin != null && pin.equals(pinCode)) {

            isLocked = false;
            failedAttempts = 0;

            return true;
        }
        failedAttempts++;
        if (failedAttempts >= 3) {
            isBlocked = true;
        }

        return false;
    }
    public void lock() {
        isLocked = true;
    }

    public boolean changePin(String oldPin, String newPin) {

        if (isBlocked == true) {
            return false;
        }

        if (isLocked == true) {
            return false;
        }

        if (oldPin == null || !oldPin.equals(pinCode)) {
            return false;
        }

        if (!isValidPin(newPin)) {
            return false;
        }

        pinCode = newPin;

        return true;
    }
    public boolean resetLock(String adminKey) {

        if (adminKey != null && adminKey.equals("ADMIN123")) {

            isBlocked = false;
            failedAttempts = 0;
            isLocked = true;

            return true;
        }

        return false;
    }
}