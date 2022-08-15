package PreWork_Assignment;

import javax.sound.sampled.SourceDataLine;

public class pattern {

    public void printStarPattern(int num) {
        System.out.println("----------------------");
        for (int i = num - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }
    
}
