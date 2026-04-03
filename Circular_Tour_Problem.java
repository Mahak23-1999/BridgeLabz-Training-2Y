class CircularTour {
    public static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalPetrol = 0, totalDistance = 0;
        int start = 0, currPetrol = 0;

        for (int i = 0; i < n; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];

            currPetrol += petrol[i] - distance[i];

            // If current petrol < 0, reset starting point
            if (currPetrol < 0) {
                start = i + 1;
                currPetrol = 0;
            }
        }

        // Check if tour is possible
        if (totalPetrol < totalDistance) {
            return -1; // Tour not possible
        }

        return start;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPump(petrol, distance);
        if (start != -1) {
            System.out.println("Truck can start at pump index: " + start);
        } else {
            System.out.println("No possible starting point for circular tour.");
        }
    }
}