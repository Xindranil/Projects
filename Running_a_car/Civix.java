import java.util.Scanner;
class Civix extends Honda implements Car,Bengaluru_speed_limits {
    static int speed ;
    public static void main(String args[]){
        Civix indranil = new Civix();
        Scanner o = new Scanner(System.in);
        set_location();
        int choice;
        boolean engine = true ;
        while(engine){
            System.out.println(" speed = " +indranil.speed+ " Speed limit = " +Honda.max_speed+ " choose action : 1 to accelerate , 2 to decelerate , 3 to stop car ");
            choice = o.nextInt();

            switch(choice){
                case 1 -> { indranil.speed_increase();
                        if ( Civix.speed > Honda.max_speed )
                        {System.out.println(" can't exceed speed limit "); indranil.speed_decrease();}
                        break; }

                case 2 -> { indranil.speed_decrease();
                        if ( Civix.speed <= 0 )
                        {System.out.println(" car stopped "); engine = false;}
                        break;}

                case 3 -> { engine = false ; System.out.println(" engine turned off ");break ; }

            }
        } 
    }

    public void speed_increase() {
        Civix.speed ++ ;         
    }

    public void speed_decrease() {
        Civix.speed -- ;         
    }
    public static void set_location(){
        int n = 0; Scanner o = new Scanner(System.in);
        System.out.println(" set location      1 : MG road      2: Downhill road");
        n = o.nextInt();
        if (n == 1){
        Honda.set_limit(Bengaluru_speed_limits.MGroad_speed_limit); System.out.println("check");}
        else if (n == 2)
        Honda.set_limit(Bengaluru_speed_limits.Downhill_speed_limit);
        else
        { System.out.println("enter valid location"); set_location(); }
    }
}