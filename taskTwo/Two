/*
 Chapter 10 - 10.14: 

(THE MYDATE CLASS) Design a class named MyDate. 

Notes:
- https://www.w3schools.com/java/java_date.asp

*/

package modulethree.taskTwo;


import java.util.Calendar;

public class Two {    
    
    public static class myDate {

        // DATA FIELDS for Year, Month, and Date
        private int year;
        private int month;
        private int day;
                

        // DATA FIELDS for Hour, Min, and Sec
        private int hour;
        private int min;
        private int sec;
        

        // NO-ARG CONSTRUCTOR - Create an object for the current date
        public myDate() {
            
            // getInstance returns current time.
            Calendar dateInfo = Calendar.getInstance(); 
            this.year = dateInfo.get(Calendar.YEAR);
            this.month = dateInfo.get(Calendar.MONTH);
            this.day = dateInfo.get(Calendar.DAY_OF_MONTH);

        }

        // CONSTRUCTOR 1 - Create a myDate object with the specified year, month, and day
        public myDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        
        
        // CONSTRUCTOR 2 - Create a myDate object with a specified elapsed time
        public myDate(long elapsedTime) {
            Calendar dateInfo = Calendar.getInstance();
            dateInfo.setTimeInMillis(elapsedTime);
            this.year = dateInfo.get(Calendar.YEAR);
            this.month = dateInfo.get(Calendar.MONTH);
            this.day = dateInfo.get(Calendar.DAY_OF_MONTH);
            this.hour = dateInfo.get(Calendar.HOUR_OF_DAY);
            this.min = dateInfo.get(Calendar.MINUTE);
            this.sec = dateInfo.get(Calendar.SECOND);
        }

        // GETTER METHODS
        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }       

        public int getHour() {
            return hour;
        }

        public int getMin() {
            return min;
        }

        public int getSec() {
            return sec;
        }
        
        
        
        // SETTER METHODS
        public void setYear(int year) {
            this.year = year;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public void setSec(int sec) {
            this.sec = sec;
        }


        public static String monthName (int month) {
            String monthStr = "";
            switch(month) {
                case 0 ->monthStr = "January";
                case 1 -> monthStr = "February";
                case 2 -> monthStr = "MArch";
                case 3 -> monthStr = "April";
                case 4 -> monthStr = "May";
                case 5 -> monthStr = "June";
                case 6 -> monthStr = "July";
                case 7 -> monthStr = "August";
                case 8 -> monthStr = "September";
                case 9 -> monthStr = "October";
                case 10 -> monthStr = "November";
                case 11 -> monthStr = "December";
            }
            return monthStr;
        }
     
    }
   
    
    // MAIN
    public static void main(String[] args) {
        myDate currentDate = new myDate(); 
        System.out.println("Current Date" + 
                "\nYear: " +currentDate.getYear() + 
                "\nMonth: " + (currentDate.getMonth() + 1) + " ( " +myDate.monthName(currentDate.getMonth()) + " )"+
                "\nDay: " + currentDate.getDay());

        myDate elapsedDate = new myDate(System.currentTimeMillis()); // Create an object with elapsed time
        System.out.println("\n\nElapsed Time Date: " + elapsedDate.getYear() + "-" + (elapsedDate.getMonth() + 1) + "-" + //Add +1 since month is 0-based
                elapsedDate.getDay() + " " + elapsedDate.getHour() + ":" + elapsedDate.getMin() + ":" + elapsedDate.getSec());
    }
}
