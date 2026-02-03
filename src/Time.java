public class Time {
    private GP gp;
    private Driver r;
    private int hours;
    private int min;
    private int sec;
    private int cent;

    public Time(GP gp, Driver r, int hours, int min, int sec, int cent) {
        this.gp = gp;
        this.r = r;
        this.hours = hours;
        this.min = min;
        this.sec = sec;
        this.cent = cent;
    }

    public GP getGp() {
        return gp;
    }

    public void setGp(GP gp) {
        this.gp = gp;
    }

    public Driver getR() {
        return r;
    }

    public void setR(Driver r) {
        this.r = r;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getCent() {
        return cent;
    }

    public void setCent(int cent) {
        this.cent = cent;
    }

    public String toString(){
        return hours+":"+min+":"+sec+"."+cent;
    }
}
