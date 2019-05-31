public class CalenderConverter {

    private final static int mo = 1;
    private final static int tu = 2;
    private final static int we = 3;
    private final static int th = 4;
    private final static int fr = 5;
    private final static int sa = 6;
    private final static int su = 7;


    static String convertDayToString(int dayNumber) {
        String dayString;

        switch (dayNumber) {
            case mo:
                dayString = "Monday";
                break;
            case tu:
                dayString = "Tuesday";
                break;
            case we:
                dayString = "Wendesday";
                break;
            case th:
                dayString = "Thursday";
                break;
            case fr:
                dayString = "Friday";
                break;
            case sa:
                dayString = "Saturday";
                break;
            case su:
                dayString = "Sunday";
                break;
            default:
                dayString = "sorry wrong number";
                break;
        }
        return dayString;

    }






        /* łatwiej ale bez stałych numerów dni...
        if (dayNumber == 1) {
            dayString = "Monday";
        } else if (dayNumber == 2) {
            dayString = "Tuesday";
        } else if (dayNumber == 3) {
            dayString = "Wendesday";
        } else if (dayNumber == 4) {
            dayString = "Thursday";
        } else if (dayNumber == 5) {
            dayString = "Friday";
        } else if (dayNumber == 6) {
            dayString = "Saturday";
        } else if (dayNumber == 7) {
            dayString = "Sunday";
        } else System.out.println("Sorry, wrong number.");

        return dayString; */


}
