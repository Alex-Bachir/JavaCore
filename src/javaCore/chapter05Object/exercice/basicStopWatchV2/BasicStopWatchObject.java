package javaCore.chapter05Object.exercice.basicStopWatchV2;

public class BasicStopWatchObject {

    
    int seconde = 0;
    int minute  = 0;
    int hour    = 0;

    public void displayTime() {

        System.out.println("Temps : " + hour + " : " + minute + " : " + seconde );
    }

    public void launch() throws InterruptedException {

        int total = 0;

            while (total < 100) {

                Thread.sleep(10);

                total++;
                seconde++;

            if (seconde == 60) {
                    seconde = 0;
                    minute++;
            }

            if (minute == 60) {
                    minute = 0;
                    hour++;
            }

            displayTime();
        }
    }
}