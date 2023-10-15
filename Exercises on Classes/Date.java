public class Date {
    int day, month, year;
    String f_day, f_month;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

    void setDay(int day) {
        this.day = day;
    }

    void setMonth(int month) {
        this.month = month;
    }
    void setYear(int year) {
        this.year = year;
    }
    void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void setNumber(int day, int month){

        f_day = String.format("%02d", this.day);
        f_month = String.format("%02d", this.month);
    }
    @Override
    public String toString() {
        setNumber(this.day, this.month);
        return this.f_day+"/"+ this.f_month + "/"+year;
    }
}
