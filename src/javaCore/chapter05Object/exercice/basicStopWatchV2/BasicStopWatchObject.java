package javaCore.chapter05Object.exercice.basicStopWatchV2;

public class BasicStopWatchObject {

    String  name;
    int  seconde;
    int   minute;
    int     hour;
    


    public BasicStopWatchObject(String name, int hour, int minute, int seconde) {

        this.name    =    name;
        this.hour    =    hour;
        this.minute  =  minute; 
        this.seconde = seconde;
        
    }



    public void displayTime() {

        System.out.println(name +" : " + hour + " : " + minute + " : " + seconde );
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