import java.util.IllegalFormatCodePointException;

public class Championship {

    private MyArray<Driver> driverList=new MyArray<>();
    private MyArray<GP> GPList=new MyArray<>();
    private MyArray<Time> timeList=new MyArray<>();

    //Creat driver
    public Driver createDriver(String name){
        Driver driver=new Driver();
        driver.setName(name);
        driverList.add(driver);
        return driver;
    }
    public MyArray<Driver> getDrivers(){
        return driverList;
    }
    public Driver getDriver(String name){
        for (Driver driver:driverList){
            if (driver.getName().equals(name)){
                return driver;
            }
        }
        return null;
    }

    //Creat GR
    public GP defineGrandPrix(String name){
        GP gp=new GP();
        gp.setName(name);
        GPList.add(gp);
        return gp;
    }
    public GP getGrandPrix(String name){
        for (GP gp:GPList){
            if (gp.getName().equals(name)){
                return gp;
            }
        }
    return null;
    }

    //Creat Time
    public Time setTime(GP gp,Driver r,int hours,int min,int sec,int cent){
        Time time=new Time(gp,r,hours,min,sec,cent);
        timeList.add(time);
        gp.addTime(time);
        r.addGP(time);
        return time;
    }

}
