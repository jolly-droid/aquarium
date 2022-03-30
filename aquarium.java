import javax.swing.*;
import java.awt.*;

public class aquarium {
     Frame aqua = new Frame();

    //constructors
    public aquarium(){}
    public aquarium(int fishNumber, int mode){
        generateBackground(mode);
       /* fish[] myfish = generateFish(fishNumber, mode);
        swim(myfish);*/
    }


//////////////////methods
private void generateBackground(int mode){
    aqua.setTitle("aquarium menu");
    aqua.setSize(1000,1000);
    aqua.pack();
    aqua.setVisible(true);
    aqua.setLocationRelativeTo(null);
    /*

    frame.setVisible(true);
    frame.setTitle("look at the fish!");
    frame.pack();
    frame.setLocationRelativeTo(null);*/


    if(mode == 0){
        aqua.setBackground(Color.blue);
    }else if (mode == 1){
        aqua.setBackground(Color.pink);
    }else{
        System.out.println("error");
    }
}

    private fish[] generateFish(int fishNumber, int mode){
        fish[] fishArray = new fish[fishNumber];
        for (int i = 0; i < fishNumber; i++){
            fishArray[i] = new fish(mode);
        }
        return fishArray;
    }
    private void swim(fish[] theSwarm){
        for  (fish i :theSwarm) {
             //i.moveFish(i);
        }
    }
}
