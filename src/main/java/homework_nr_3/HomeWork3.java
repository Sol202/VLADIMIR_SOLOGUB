package homework_nr_3;

public class HomeWork3 {

    public static void main(String[] args) {

        int monthOfTheYear = 3;

        switch (monthOfTheYear) {
            case 1:
                System.out.println(monthOfTheYear + "  It's January");
                break;
            case 2:
                System.out.println(monthOfTheYear + "  It's February");
                break;
            case 3:
                System.out.println(monthOfTheYear + "  It's March");
                break;
            case 4:
                System.out.println(monthOfTheYear + "  It's April");
                break;
            case 5:
                System.out.println(monthOfTheYear + "  It's May");
                break;
            case 6:
                System.out.println(monthOfTheYear + "  It's June");
                break;
            case 7:
                System.out.println(monthOfTheYear + "  It's July");
                break;
            case 8:
                System.out.println(monthOfTheYear + "  It's August");
                break;
            case 9:
                System.out.println(monthOfTheYear + "  It's September");
                break;
            case 10:
                System.out.println(monthOfTheYear + "  It's October");
                break;
            case 11:
                System.out.println(monthOfTheYear + "  It's November");
                break;
            case 12:
                System.out.println(monthOfTheYear + "  It's December");
                break;
            default:

                System.out.println(monthOfTheYear);

        }

        System.out.println("-------------------------------");

        for (int i = 100; i <= 1000; i += 5) {
            System.out.println(i);

        }

        System.out.println("-------------------------------");

        double sum = 0;

        for (int z = 1; z <= 97; z += 2) {
            sum += (double)z / (z + 2);
            System.out.println(sum);

        }
    }
}

