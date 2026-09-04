package javaCore.chapter05Object.exercice.basicStopWatchV2;

public class BasicStopWatch {

    public static void main(String[] args) throws InterruptedException {

        BasicStopWatchObject stopWatch1 = new BasicStopWatchObject("Temps", 0, 0,0);

        stopWatch1.launch();
        stopWatch1.displayTime();

        BasicStopWatchObject stopWatch2 = new BasicStopWatchObject("Oeuf Dur", 0, 0, 0);

        stopWatch2.launch();
        stopWatch2.displayTime();
    }
}