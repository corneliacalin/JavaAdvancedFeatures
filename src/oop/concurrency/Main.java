package oop.concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        MySecondThread mySecondThread = new MySecondThread();
        Thread myThread1 = new Thread(mySecondThread);
        myThread1.start();

        System.out.println("main thread start here");
        Thread.sleep(5000);
        System.out.println("thread main is still running");
        Thread.sleep(7000);
        System.out.println("Maint thread ends here");


        Banch myBench=new Banch(1);
        SeatTakeAThread seatTakeAThread1 = new SeatTakeAThread(myBench);
        SeatTakeAThread seatTakeAThread2 = new SeatTakeAThread(myBench);
        seatTakeAThread1.start();
        seatTakeAThread2.start();



    }
}
