package oop.concurrency;

public class Banch {
    Integer availableSeat;

    public Banch(Integer availableSeat) {
        this.availableSeat = availableSeat;
    }
    public synchronized void takeASeat(){
        if(availableSeat>0){
            System.out.println("iau un loc");
            availableSeat--;
            System.out.println("au ramas locuri " + availableSeat);

        }
        else {
            System.out.println("nu mai sunt locuri");
        }
    }
    public void printSyncronizedBlock(){
        synchronized (this){
            System.out.println("in sync block");
        }
        System.out.println("not syncronized code");
    }
}
