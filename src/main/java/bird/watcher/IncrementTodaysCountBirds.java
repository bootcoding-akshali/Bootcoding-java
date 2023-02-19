package bird.watcher;

public class IncrementTodaysCountBirds {
    int[] birdsPerDay = { 0, 2, 5, 3, 7, 8, 4};
    public int incrementTodaysCount() {
      int[] birdsPerDay = { 0, 2, 5, 3, 7, 8, 4};
        int todaysBirdCount = birdsPerDay[birdsPerDay.length-1];
        return todaysBirdCount + 1;

    }

    public static void main(String[] args) {
        IncrementTodaysCountBirds incrementTodaysCountBirds = new IncrementTodaysCountBirds();
        System.out.println(incrementTodaysCountBirds.incrementTodaysCount());
    }
}
