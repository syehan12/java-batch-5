package AssigmentDay22B.EVChargingStation;

public class EVChargingStation {


        private String stationId;
        private double maxCapacityKw;
        private double currentPowerKw;
        private boolean isActive;

        public EVChargingStation(String stationId, double maxCapacityKw){


            if (stationId == null || stationId.trim().isEmpty()) {
                this.stationId = "STATION-001";
            } else {
                this.stationId = stationId;
            }


            if (maxCapacityKw <= 0.0) {
                this.maxCapacityKw = 50.0;
            } else {
                this.maxCapacityKw = maxCapacityKw;
            }

            this.currentPowerKw = 0.0;
            this.isActive = true;
        }

        public String getStationId () {
            return stationId;
        }

        public double getMaxCapacityKw () {
            return maxCapacityKw;
        }

        public double getCurrentPowerKw () {
            return currentPowerKw;
        }

        public boolean isActive () {
            return isActive;
        }

        public void setActive ( boolean active){
            this.isActive = active;

            if (active == false) {
                this.currentPowerKw = 0.0;
            }
        }

        public boolean startCharging ( double requestedKw){

            if (isActive == false) {
                return false;
            }

            if (requestedKw <= 0.0) {
                return false;
            }

            if (requestedKw > maxCapacityKw) {
                return false;
            }

            currentPowerKw = requestedKw;
            return true;
        }

        public double stopCharging () {

            double stoppedPower = currentPowerKw;

            currentPowerKw = 0.0;

            return stoppedPower;
        }
    }

