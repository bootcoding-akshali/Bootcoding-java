package bird.watcher;

public class BirdWatcher {
    static int[] birdsPerDay = { 0, 2, 5, 3, 7, 8, 4};
    public BirdWatcher(int[] birdsPerDay){
        this.birdsPerDay = birdsPerDay;
    }

         public int[] getLastWeek() {
          return birdsPerDay;
    }
    public int getToday() {
        return birdsPerDay.length-1;
    }
      public int incrementTodaysCount() {
          int[] birdsPerDay = { 0, 2, 5, 3, 7, 8, 4};
        int todaysBirdCount = birdsPerDay[birdsPerDay.length-1];
        int incrementedtodaysBirdCount = todaysBirdCount + 1;
         return incrementedtodaysBirdCount;

    }
     public boolean hasDayWithoutBirds() {
        for (int birdsCountForToday : birdsPerDay) {
            if (birdsCountForToday == 0) {
                return true;
            }
        }
        return false;
    }
        public int getCountForFirstDays(int  givenDaysToCount ) {
            int totalBirdsForgivenDays = 0;

            if(givenDaysToCount >= birdsPerDay.length) {
                return givenDaysToCount;
            }
            for(int i = 0; i < givenDaysToCount; i++) {
                totalBirdsForgivenDays = totalBirdsForgivenDays + birdsPerDay[i];
            }
           return totalBirdsForgivenDays;
        }

        public int getBusyDays() {

            int busyDay = 0;
            for(int i = 0; i < birdsPerDay.length; i++) {
                if(birdsPerDay[i] >= 5) {
                    busyDay++;
                }
            }
            return busyDay;
        }
        public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
           int[] lastWeek = birdWatcher.getLastWeek();
           System.out.println(lastWeek[6]);
           birdWatcher.getToday();

       }
}
