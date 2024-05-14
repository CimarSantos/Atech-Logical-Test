public class PassengerCount {

    public static int passengerCount(int quantityOfPassengers, int[] momentsOfEntry, int[] momentsOfExit) {
        
        int passengersSimultaneous = 0;
        int currentPassengers = 0;
        int i = 0;
        int j=0;

        while (i < quantityOfPassengers && j < quantityOfPassengers) {

            if (momentsOfEntry[i] < momentsOfExit[j]) {
                
                currentPassengers++;
                passengersSimultaneous = Math.max(passengersSimultaneous, currentPassengers);
                i++;

            } else {

                currentPassengers--;
                j++;
                
            }
        }

         return passengersSimultaneous;

    }
}
