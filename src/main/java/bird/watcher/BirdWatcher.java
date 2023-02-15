package bird.watcher;

import java.util.ArrayList;
import java.util.List;

public class BirdWatcher {

    public void getLastWeek() {

        int[] birdsPerDay = { 0, 2, 5, 3, 7, 8, 4};

        List<Integer> birdCameLastWeek = new ArrayList<>();

        for(int birdCount: birdsPerDay) {
            birdCameLastWeek.add(birdCount);
        }
        System.out.println("birds count for last week : "+birdCameLastWeek);
    }

    public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher();
        birdWatcher.getLastWeek();

    }

}
