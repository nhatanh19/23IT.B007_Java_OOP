public class Time {
    static int hour, minute, second;
    String f_hour, f_minute, f_second;

    Time(int hour, int minute, int second) {
        Time.hour = hour;
        Time.minute = minute;
        Time.second = second;
    }

    int getHour() {
        return hour;
    }

    int getMinute() {
        return minute;
    }

    int getSecond() {
        return second;
    }
    void setHour(int hour){
        Time.hour = hour;
    }

    void setMinute(int minute) {
        Time.minute = minute;
    }

    void setSecond(int second) {
        Time.second = second;
    }
    void setTime(int hour, int minute, int second){
        Time.hour = hour;
        Time.minute = minute;
        Time.second = second;
    }
    void fomatNumber(int h, int m, int s){
        this.f_hour = String.format("%02d", h);
        this.f_minute = String.format("%02d", m);
        this.f_second = String.format("%02d", s);
    }
    @Override
    public String toString(){
        fomatNumber(hour, minute, second);
        return f_hour+":"+f_minute+":"+f_second;
    }
    Time nextSecond(){
        if(second == 59){
           second = 0;
           if(minute == 59){
              minute = 0;
              if(hour == 23){
                  hour = 0;
              } else hour += 1;
           } else minute += 1;
        } else second += 1;
        return new Time(hour, minute, second);
    }

    Time previousSecond(){
        if(second == 0){
            second = 59;
            if(minute == 0){
                minute = 59;
                if(hour == 0){
                    hour = 23;
                } else hour -=1;
            } else minute -=1;
        } else second -=1;
        return new Time(hour, minute , second);
    }
}
