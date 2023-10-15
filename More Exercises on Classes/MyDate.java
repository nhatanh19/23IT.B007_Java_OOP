public class MyDate {
    private int year, month, day;
    String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep","Oct", "Nov", "Dec"};
    String[] DAYS = {"Saturday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    int[] DaysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

    boolean isLeapYear(int year){
        if(year%4 == 0 && year%100 != 0){
            return true;
        } else if (year%400 == 0) {
            return true;
        } else return false;
    }
    boolean isValidDate(int year, int month, int day){
        if(year <= 9999 && year >= 1 &&  month <= 12 && month >=1 ){
            if(month == 2){
                if(isLeapYear(year) && day == 28){
                    return true;
                } return false;
            }else {
                if (day == 30 || day == 31){
                    return true;
                }else return false;
            }
        }else return false;
    }
    int getDayOfWeek(int year, int month, int day){
        //Công thức Zeller's Congruence
        int J = year/100; // is the zero-based century within the year
        int K = year%100; //is the year within the century
        int dayOfWeek = (day + ((13*(month+1))/5) + K + (K/4) + (J/4) - 2*J)%7;
        return dayOfWeek; // 0 for Sat, 1 for Sun, 2 for Mon...
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public String toString(){
        String xxxday = null, mmm = null;
        int dayofweek = getDayOfWeek(this.year, this.month, this.day);
        xxxday = DAYS[dayofweek-1];
        mmm = MONTHS[this.month-1];
        return xxxday + ' '+ this.day +' '+ mmm + ' '+ this.year;
    }
    MyDate nextDay(){
        int dayofmonth = DaysInMonths[this.month - 1];
        if(this.day == dayofmonth){
            this.day = 1;
            if(this.month == 12){
                this.month = 1;
                if(this.year == 9999){
                    this.year =1;
                }else this.year +=1;
            }else this.month += 1;
        }else this.day +=1;
        return this;
    }
    MyDate nextMonth(){
        if(this.month == 12){
            this.month = 1;
            if(this.year == 9999){
                this.year =1;
            }else this.year +=1;
        }else this.month += 1;
        return this;
    }
    MyDate nextYear(){
        if(this.year == 9999){
            this.year =1;
        }else this.year +=1;
        return this;
    }
    MyDate previousDay(){
        int dayofmonth;
        if(this.month -2 < 0){
            dayofmonth = 31;
        }else dayofmonth = DaysInMonths[this.month-2];

        if(this.day == 1){
            this.day = dayofmonth;
            if(this.month == 1){
                this.month = 12;
                if(this.year == 1){
                    this.year = 9999;
                }else this.year-=1;
            }else this.month -=1;
        }else this.day -=1;
        return this;
    }
    MyDate previousMonth(){
        if(this.month == 1){
            this.month = 12;
            if(this.year == 1){
                this.year = 9999;
            }else this.year-=1;
        }else this.month -=1;
        return this;
    }
    MyDate previousYear(){
        if(this.year == 1){
            this.year = 9999;
        }else this.year-=1;
        return this;
    }
}
