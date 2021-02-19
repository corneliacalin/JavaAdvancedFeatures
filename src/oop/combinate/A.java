package oop.combinate;

abstract public class A {
    abstract public void calcul(int x);

    public long durataCalcul(int x) {
        long time1 = System.currentTimeMillis();
        System.out.println("time1= " + time1);
        calcul(x);
        long time2 = System.currentTimeMillis();
        System.out.println("time2= " + time2);
        return time2 - time1;
    }


}

