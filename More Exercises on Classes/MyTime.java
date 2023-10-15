public class MyTime {
    private int hour = 0,minute = 0, second = 0;
    MyTime(){}

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    void setTime(int hour, int minute, int second){
        if(hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    @Override
    public String toString(){
        return String.format("%02d", hour) + ':' +  String.format("%02d", minute) + ':' + String.format("%02d", second);
    }
    MyTime nextSecond(){
        if(second == 59){
            second = 0;
            if(minute == 59){
                minute = 0;
                if(hour == 23){
                    hour = 0;
                } else hour += 1;
            } else minute += 1;
        } else second += 1;
        return this;
    }
    MyTime nextMinute(){
            if(minute == 59){
                minute = 0;
                if(hour == 23){
                    hour = 0;
                } else hour += 1;
            } else minute += 1;
        return this;
    }
    MyTime nextHour(){
            if(hour == 23){
                hour = 0;
            } else hour += 1;
        return this;
    }
    MyTime previousSecond(){
        if(second == 0){
            second = 59;
            if(minute == 0){
                minute = 59;
                if(hour == 0){
                    hour = 23;
                } else hour -=1;
            } else minute -=1;
        } else second -=1;
        return this;
    }
    MyTime previousMinute(){
            if(minute == 0){
                minute = 59;
                if(hour == 0){
                    hour = 23;
                } else hour -=1;
            } else minute -=1;
        return this;
    }
    MyTime previousHour(){
                if(hour == 0){
                    hour = 23;
                } else hour -=1;
        return this;
    }
}
