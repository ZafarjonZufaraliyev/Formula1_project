public class Driver {
    private String name;
    private MyArray<Time> timeList=new MyArray<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGP(Time time){
        timeList.add(time);
    }
    public MyArray<GP> getRecod(){
        MyArray<GP> gps=new MyArray<>();
        for (Time time:timeList){
            gps.add(time.getGp());
        }
        return gps;
    }
}
