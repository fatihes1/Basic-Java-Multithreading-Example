import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        MultiThreadExample multiThreadExample = new MultiThreadExample();
        multiThreadExample.start();
        InputAl inputAl = new InputAl();
        inputAl.start();
    }
}
 class MultiThreadExample extends Thread {
     public static char harf ;
     MultiThreadExample() {
     }
    public void run () {
        while(harf != 'q') {
            Random random = new Random();
            int sayi = random.nextInt();
            System.out.println(sayi);
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class InputAl extends Thread {
    MultiThreadExample multiThreadExample = new MultiThreadExample();
    InputAl () {
    }
    public void run () {

        while(true) {
            Scanner scanner = new Scanner(System.in);
            MultiThreadExample.harf = scanner.next().charAt(0);
            if(!multiThreadExample.isAlive()){
                break;
            }
        }
        }
    }

