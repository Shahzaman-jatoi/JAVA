import java.util.Scanner;

public class Switch {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        String dept;
        int id;

        System.out.println("Please Select your department: " +
                "1. IT\n" + " 2. Accounts\n" + " 3. Admin");
        dept = in.next();
        System.out.println("Please enter your ID from given Numbers: " + "For IT: 54395, 54655, 54815\n" + "For Accounts: 64395, 64655, 64815\n" + "For Admin: 74395, 74655, 74815\n");
        id = in.nextInt();

        switch (dept){
            case "IT":
                switch(id){
                    case 54395:
                        System.out.println("Shah zaman");
                        break;
                    case 54655:
                        System.out.println("Dil zaib");
                        break;
                    case 54815:
                        System.out.println("Hamza");
                        break;
                    default:
                        System.out.println("Enter Valid ID");
                }
                break;
            case "Accounts":
                switch (id){
                    case 64395:
                        System.out.println("Izhan");
                        break;
                    case 64655:
                        System.out.println("zubair");
                        break;
                    case 64815:
                        System.out.println("salah");
                        break;
                    default:
                        System.out.println("Enter Valid ID");
                }
                break;
            case "Admin":
                switch(id){
                    case 74395:
                        System.out.println("ABC ");
                        break;
                    case 74655:
                        System.out.println("air");
                        break;
                    case 74815:
                        System.out.println("SEAT");
                        break;
                    default:
                        System.out.println("Enter Valid ID");

                }
            break;

        }

    }
}
