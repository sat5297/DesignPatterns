package CollegeAttendanceProxy;

public class ProxyPerson implements AttendanceInterface{
    private String name;
    
    public ProxyPerson(String name){
        this.name = name;
    }

    @Override
    public void markAttendance(){
        System.out.println("Proxy Attendance Marked.");
    }
}
