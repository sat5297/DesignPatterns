package CollegeAttendanceProxy;

public class CollegeAttendanceProxy {
    public static void main(String[] args) {
        
        AttendanceInterface realPerson = new ProxyPerson("P1");
        
        AttendanceInterface realPerson1 = new RealPerson("");

        realPerson.markAttendance();

        realPerson1.markAttendance();

    }
}
