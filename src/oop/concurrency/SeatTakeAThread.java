package oop.concurrency;

public class SeatTakeAThread extends Thread{
    private Banch bench;
    public SeatTakeAThread (Banch bench) {
        this.bench = bench;
    }
        @Override
        public void run() {
            bench.takeASeat();
        }


    }

