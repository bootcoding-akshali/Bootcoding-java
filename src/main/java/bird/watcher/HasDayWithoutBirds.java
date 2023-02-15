package bird.watcher;

public class HasDayWithoutBirds {
    int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};

    public boolean hasDayWithoutBirds() {
        for (int birdsCountForToday : birdsPerDay) {
            if (birdsCountForToday == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HasDayWithoutBirds hasDayWithoutBirds = new HasDayWithoutBirds();
        System.out.println( hasDayWithoutBirds.hasDayWithoutBirds());

    }
}
