public class Student implements Comparable<Student> {
    int rollno;
    String name;
    String department;
    String batch;

    public Student(int rollno, String name, String department, String batch) {
        this.rollno = rollno;
        this.name = name;
        this.department = department;
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }

//    public int compareTo(Student s) {
//       return this.rollno-s.rollno;
//    }
    public int compareTo(Student st)
    {
        return this.batch.compareTo(st.batch);
    }

    //    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public void setBatch(String batch) {
//        this.batch = batch;
//    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getBatch() {
        return batch;
    }
}
