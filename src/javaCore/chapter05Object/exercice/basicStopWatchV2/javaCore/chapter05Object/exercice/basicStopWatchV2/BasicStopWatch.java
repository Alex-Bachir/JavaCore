package javaCore.chapter05Object.exercice.basicStopWatchV2;

public class BasicStopWatch {

    public static void main(String[] args) throws InterruptedException {

        BasicStopWatchObject stopwatch1 = new BasicStopWatchObject();

        stopwatch1.launch();
        stopwatch1.displayTime();
    }
}