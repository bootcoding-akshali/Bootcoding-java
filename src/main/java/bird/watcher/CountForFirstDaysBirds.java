package bird.watcher;

public class CountForFirstDaysBirds {
    int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};

    public int getCountForFirstDays(int givenDaysToCount) {
            int totalBirdsForgivenDays = 0;
            if(givenDaysToCount >= birdsPerDay.length) {
                return givenDaysToCount;
            }
            for(int i = 0; i < givenDaysToCount; i++) {
                totalBirdsForgivenDays = totalBirdsForgivenDays + birdsPerDay[i];
            }
           return totalBirdsForgivenDays;
        }

    public static void main(String[] args) {
        CountForFirstDaysBirds countForFirstDaysBirds = new CountForFirstDaysBirds();
        System.out.println(countForFirstDaysBirds.getCountForFirstDays(4));
    }
}
