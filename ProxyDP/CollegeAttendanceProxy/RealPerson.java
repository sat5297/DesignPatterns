package CollegeAttendanceProxy;

public class RealPerson implements AttendanceInterface{
    private String name;

    public RealPerson(String name){
        this.name = name;
    }
    @Override
    public void markAttendance(){
        System.out.println("Real Guy : Present");
    }
}
