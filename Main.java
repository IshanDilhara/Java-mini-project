import java.util.ArrayList;
import java.util.Scanner;

class Main {

    private static ArrayList<Guest> guests=new ArrayList<>();
    private static ArrayList<Room> rooms=new ArrayList<>();
    private static ArrayList<Integer> not_available=new ArrayList<>();


    public static void main(String[] args ) {
        for (int i = 0 ; i < 5; i++) {
        //System.out.println(rooms.size());
            Room room = new Room(i + 1);
            rooms.add(room);

        }

        method1();
    }





    private static void input_cont(int input) {

        switch (input) {
            case 0:
                System.exit(1);
                //System.out.println("Thank you !");
                break;

            case 1:
                method2();
                break;

            case 2:
                view();
                break;


            case 3:
                allocateroom();
                break;


            case 4:
                change();
                break;


            case 5:
                checkin();
                break;

            case 6:
                chekout();
                break;


            case 7:
                bill();
        }
    }




    private static void method1() {
        System.out.println("Welcome to hotel TAJ");
        System.out.println("=======================");
        System.out.println(" ");
        System.out.println("1.Register guests");
        System.out.println("2.View available rooms");
        System.out.println("3.Allocate a room for a guest");
        System.out.println("4.Change/ delete room allocation for a guest");
        System.out.println("5.Check-in to a room");
        System.out.println("6.Checkout from a room");
        System.out.println("7.Generate the bill");
        System.out.println("0.Exit");

        System.out.println(" ");
        System.out.print("Please enter your choice: ");
        Scanner choice = new Scanner(System.in);
        int input = Integer.parseInt(choice.nextLine());
        input_cont(input);
    }

    private static void view(){
        System.out.println("Available rooms..");
        for(Room room: rooms){
            int room_no =room.getRoom_no();

            if(!not_available.contains(room_no)){
                System.out.println("Room "+ room_no +" is available");
            }
        }
        method1();

    }

    private static void method2(){
        System.out.println("Enter Details");
        Scanner reg=new Scanner(System.in);
        System.out.print("name:");
        String name = reg.nextLine();
        System.out.print("ID number");
        String ID_number= reg.nextLine();
        System.out.print("Mobile number");
        String mobile_number= reg.nextLine();
        Guest guest= new Guest(name,ID_number,mobile_number);
        guests.add(guest);
        System.out.println(guest.getName()+" successfully registered..");
        System.out.println(" ");
        System.out.println("There are "+guests.size()+" guests");






    }

    private static void allocateroom(){
        System.out.println("****************");
        Scanner allocate=new Scanner(System.in);
        System.out.print("Enter the name:");
        String name= allocate.nextLine();
        System.out.print("Enter the allocate room number:");
        int id=Integer.parseInt(allocate.nextLine());

        not_available.add(id);
        method1();


    }
    
    private static void change(){
        System.out.println("Attention....");
        System.out.println("If you change the room please First remove your booking,get menu and enter 6 & get menu and allocate room ,Enter 3");
        method1();

    }

    private static void checkin(){
        System.out.println("Attention....");
        System.out.println("Get menu and Enter 2,If you allocated the room no view this room");
        method1();

    }

    private static void chekout(){
        System.out.println("************");
        Scanner cout=new Scanner(System.in);
        System.out.print("Enter to the checkout:");
        int id=Integer.parseInt(cout.nextLine());
        not_available.remove((Integer) id);
        method1();

    }

    private static void bill(){
        System.out.println("-----Hotel Taj-----");
        System.out.println("Your bill = RS.1500.oo/=");
        System.out.println("Thank you...");
        method1();
    }
}