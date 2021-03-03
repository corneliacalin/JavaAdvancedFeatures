package oop.polymorphism.exercitiu1;

public class Main {
    public static void main(String[] args) {
        final String player = "Netflix";
        VodPlayer vodPlayer =null;
        if(player.equals("Netflix")) {
            vodPlayer = new NetflixPlayer();
        }else if (player.equals("hbo")) {
            vodPlayer = new HboGoPlayer();
        } else{
            vodPlayer= new DefaultPlayer();
        }
        playEpisode(vodPlayer, "goooooo");
    }
    static void playEpisode (VodPlayer vodPlayer, String title){
        vodPlayer.play(title);
    }
}

