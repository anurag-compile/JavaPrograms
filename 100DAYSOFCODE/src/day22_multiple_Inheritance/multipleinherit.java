package day22_multiple_Inheritance;

interface Event {
    public void start();
}
interface Sports {
    public void play();
}
interface Hockey extends Sports, Event{
    public void show();
}
class Tester{
    public static void main(String[] args){
        Hockey hockey = new Hockey() {
            public void start() {
                System.out.println("Start Event");
            }
            public void play() {
                System.out.println("Play Sports.");
            }
            public void show() {
                System.out.println("Show Hockey.");
            }
        };

        hockey.start();
        hockey.play();
        hockey.show();
    }
}
