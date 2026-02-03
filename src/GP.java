import java.util.Arrays;
import java.util.Comparator;

public class GP {
    private String name;
    private MyArray<Time> timeList = new MyArray<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTime(Time time) {
        timeList.add(time);
    }

    public MyArray<Driver> getGPRanking() {
        Time[] temp = new Time[timeList.size()];
        for (int i = 0; i < timeList.size(); i++) {
            temp[i] = timeList.get(i);
        }
        Comparator<Time> comparator=(Time o1, Time o2)-> {
                int n=o1.getHours()-o2.getHours();
                if (n==0){
                    n=o1.getMin()-o2.getMin();
                    if (n==0){
                        n=o1.getSec()-o2.getSec();
                        if (n==0){
                            n=o1.getCent()-o2.getCent();
                        }
                    }
                }
                return n;
            };
        Arrays.sort(temp,comparator);
        MyArray<Driver> myDriver=new MyArray<>();
        for (Time time:temp){
            myDriver.add(time.getR());
        }
        return myDriver;
    }
    public int getPosition(Driver driver){
        MyArray<Driver> myArray= getGPRanking();
        int index=myArray.indexOf(driver);
        return index+1;
    }
}
