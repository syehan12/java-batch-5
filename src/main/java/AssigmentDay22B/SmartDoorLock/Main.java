package AssigmentDay22B.SmartDoorLock;

public class Main {
    public static void main(String[] args) {

        SmartDoorLock lock = new SmartDoorLock("1234");

        System.out.println("Initial Locked: "
                + lock.isLocked());

        System.out.println("Wrong PIN 1: "
                + lock.unlock("9999"));

        System.out.println("Wrong PIN 2: "
                + lock.unlock("8888"));

        System.out.println("Wrong PIN 3: "
                + lock.unlock("7777"));

        System.out.println("Blocked: "
                + lock.isBlocked());

        System.out.println("Correct PIN while blocked: "
                + lock.unlock("1234"));

        System.out.println("Reset Lock: "
                + lock.resetLock("ADMIN123"));

        System.out.println("Blocked after reset: "
                + lock.isBlocked());

        System.out.println("Unlock with correct PIN: "
                + lock.unlock("1234"));

        System.out.println("Locked: "
                + lock.isLocked());

        System.out.println("Change PIN: "
                + lock.changePin("1234", "5678"));

        lock.lock();

        System.out.println("Unlock using new PIN: "
                + lock.unlock("5678"));
    }
}