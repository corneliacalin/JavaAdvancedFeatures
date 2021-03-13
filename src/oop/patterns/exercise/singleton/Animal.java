package oop.patterns.exercise.singleton;

public class Animal {

        private static Animal instance;
        private String type;


        private Animal() {
            System.out.println("Constructorul Animal l-a datorie. ");
        }
        public static Animal getInstance() {
            if (instance == null) {
                synchronized (Animal.class) {
                    if (instance == null) {
                        instance = new Animal();
                    }
                }
            }
            return instance;
        }


        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
}
