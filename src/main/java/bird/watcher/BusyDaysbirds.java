package bird.watcher;

public class BusyDaysbirds {
    int[] birdPerDay = {0, 2, 5, 3, 7, 8, 4};

    public int getBusyDays() {

        int busyDay = 0;
        for(int i = 0; i < birdPerDay.length; i++) {
            if(birdPerDay[i] >= 5) {
                busyDay++;
            }
        }
        return busyDay;
    }

    public static void main(String[] args) {
        BusyDaysbirds countPTodayBird = new BusyDaysbirds();
        System.out.println( countPTodayBird.getBusyDays());

    }
}
