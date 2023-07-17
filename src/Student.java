public class Student extends Person{
    public int studentNumber;
    public int averageMark;

    public boolean isEligibleToEnroll(String name) {
        return false;
    }

    public int getSeminarsTaken() {
        return 0;
    }
}
