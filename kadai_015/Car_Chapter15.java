package kadai_015;

public class Car_Chapter15{

    private int gear;
    private int speed;

    public Car_Chapter15(int gear, int speed){
        this.gear = gear;
        this.speed = speed;

    } 

    public void gearChange(int afterGear){

        if(afterGear >= 1 && afterGear<= 5){
            System.out.println("ギア"+ gear + "から" + afterGear + "へ切替ました");
            gear = afterGear;
            speed = gear * 10;
        }else {
            System.out.println("ギア1～5の中から選んでください");
        } 
    }

    public void run(){
        System.out.println("速度は " + speed + "　km/hです");

    }   
}
