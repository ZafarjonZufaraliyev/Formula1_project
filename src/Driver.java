public class Driver {
    private String name;
    private MyArray<Time> timeList=new MyArray<>();
    private int points[]={25, 18, 15, 12, 10, 8, 6, 4 ,2 ,1};
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
    public int getPoints(){
        int total=0;
        for (Time time:timeList){
            GP gp=time.getGp();
            int position= gp.getPosition(this);
            total=points[position-1]+total;
        }
        return total;
    }
}
