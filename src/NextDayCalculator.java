public class NextDayCalculator {
    public static boolean checkLeapYear(int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    public static String isNextDayCalculator(int day, int month, int year) {
        if(month > 0 && month <13) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12: {
                    if(day > 0 && day < 31) {
                        day += 1;
                    } else if (day == 31 && month != 12) {
                        day = 1;
                        month += 1;
                    } else if (month == 12 && day == 31) {
                        day = 1;
                        year += 1;
                        month = 1;
                    }
                    break;
                }
                case 4, 6, 9, 11: {
                    if(day > 0 && day < 30){
                        day += 1;
                    }
                    if (day == 30) {
                        day = 1;
                        month += 1;
                    }
                    break;
                }
                case 2: {
                    if(checkLeapYear(year) && day == 28) {
                        day += 1;
                    } else {
                        day = 1;
                        month += 1;
                    }
                    break;
                }
            }
        }
        return day + "/" + month + "/" + year;
    }
}