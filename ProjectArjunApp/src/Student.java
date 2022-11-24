public class Student {

    private int studentID;
    private String studentName;
    private String studentPhone;
    private String studentCity;
    private String hobies;

    public Student() {
    }

    public Student(int studentID, String studentName, String studentPhone, String studentCity, String hobies) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
        this.hobies = hobies;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getHobies() {
        return hobies;
    }

    public void setHobies(String hobies) {
        this.hobies = hobies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", hobies='" + hobies + '\'' +
                '}';
    }
}