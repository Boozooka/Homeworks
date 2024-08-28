public class Student {
    private String name, group, studentId;
    public Student (String name, String group, String studentId){
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Student guest = (Student) obj;
        return studentId.equals(guest.studentId);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + ((studentId == null) ? 0 : studentId.hashCode());
        return result;
    }
}
