public class fish {

    private int fishStartX = 0;
    private int fishStartY = 0;

    public fish() { // to catch errorhandeling
    }

    //constructor with fishmode
    public fish(int mode) {

    }
/*
mode 0 is normal mode
mode 1 is partymode
 */
    private void moveFish(int mode){
        if(mode == 0){
            fishStartX = getFishStartX() + 1;
            fishStartY = getFishStartY() + 1;
            if (getFishStartX() > 100){
                fishStartX = getFishStartX() + 1;
            }
        }else if(mode == 1){

            fishStartX = getFishStartX() + 1;
            fishStartY = getFishStartY() + 2;
            if (getFishStartX() > 100){
                fishStartX = getFishStartX() + 4;
            }
        } else{

            fishStartX = getFishStartX() + 1;

        }
    }




    //getter and setter
    public int getFishStartX() {
        return fishStartX;
    }

    public void setFishStartX(int fishStartX) {
        this.fishStartX = fishStartX;
    }

    public int getFishStartY() {
        return fishStartY;
    }
}
