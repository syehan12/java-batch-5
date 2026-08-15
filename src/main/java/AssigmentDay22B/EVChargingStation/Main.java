package AssigmentDay22B.EVChargingStation;

public class Main {

    public static void main(String[] args) {

        EVChargingStation station =
                new EVChargingStation("FAST-EV-01", 100.0);

        System.out.println("=== EV CHARGING STATION ===");

        System.out.println("Station ID: "
                + station.getStationId());

        System.out.println("Max Capacity: "
                + station.getMaxCapacityKw());

        System.out.println("Initial Power: "
                + station.getCurrentPowerKw());

        System.out.println("Active: "
                + station.isActive());

        System.out.println();

        System.out.println("Start 120 kW: "
                + station.startCharging(120.0));

        System.out.println("Start 60 kW: "
                + station.startCharging(60.0));

        System.out.println("Current Power: "
                + station.getCurrentPowerKw());

        System.out.println("Stop Charging: "
                + station.stopCharging());

        System.out.println("Current Power: "
                + station.getCurrentPowerKw());

        System.out.println();

        System.out.println("Start 80 kW: "
                + station.startCharging(80.0));

        station.setActive(false);

        System.out.println("Active after deactivation: "
                + station.isActive());

        System.out.println("Power after deactivation: "
                + station.getCurrentPowerKw());

        System.out.println("Start 50 kW after deactivation: "
                + station.startCharging(50.0));
    }
}