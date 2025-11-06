public class Simpcalc {
    public static void main(String[]args){
// Queston 1
String day = "Three";
switch(day) {
    case "One": System.out.print("It is Monday");
    break;
    case "Two": System.out.println("It is Tuesday");
    break;
    case "Three": System.out.println("It is Wednesday");
        break;
    case "Four": System.out.println("It is Thursday");
        break;
    case "Five": System.out.println("It is Friday");
        break;
    case "Six": System.out.println("It is Saturday");
        break;
    case "Seven": System.out.println("It is Sunday");
    break;
    default:System.out.println("Invalid day");
}
//Qustion 2

    int month =4;
    switch (month){
        case 12:
        case 1:
        case 2:
            System.out.println("Winter");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Spring");
            break;
        case 6:
        case 7:
        case 8:
            System.out.print("Summer");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Fall");
            break;
        default:System.out.println("Invalid month numbers");
}
//Queston 3
                    int Month =7;
                   switch (Month) {
                        case 1:  // January
                        case 3:  // March
                        case 5:  // May
                        case 7:  // July
                        case 8:  // August
                        case 10: // October
                        case 12: // December
                            System.out.println("This month has 31 days.");
                            break;

                        case 4:  // April
                        case 6:  // June
                        case 9:  // September
                        case 11: // November
                            System.out.println("This month has 30 days.");
                            break;

                        case 2:  // February
                            System.out.println("This month has 28 days");
                            break;

                        default:
                            System.out.println("Invalid month number! Please enter a value from 1 to 12.");
                    }
                





    }
}





