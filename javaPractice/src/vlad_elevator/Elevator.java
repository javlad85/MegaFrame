package elevator;

public class Elevator {

 int tot_floor = 4;
 int floor_Status = 2;
 int floor_Req = 2;



    public int move_Up(){
        if(floor_Status < floor_Req) {
            for (int i = 2; i <= 4; i++) {
                System.out.println("...moving up");
            }
        }
        else{
            System.out.println("door open");
        }
        return floor_Status;
    }

    public int move_down(){
        if(floor_Status > floor_Req){
            for(int i = floor_Status; i<=floor_Req; i--){
                System.out.println("...moving down");
            }
        }
        return floor_Status;
    }

    public static void main(String[] args) {
        Elevator el1 = new Elevator();
        el1.move_Up();
       // el1.move_down();
    }

}
