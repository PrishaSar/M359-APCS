package Unit3_Boolean_If_Statements;

public class Student {
    private String fName;
    private String lName;
    private int idNum;

    public Student(String fName, String lName, int idNum){
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public boolean equals(Student other){
        if (this.fName == other.fName && this.lName==other.lName){
            return true;
        }
        else{
            return false;
        }
    }

    public int studCompareTo(Student other){
        String theirFandL = other.lName + other.fName;
        String myFandL = this.lName + other.fName;

        return myFandL.compareTo(theirFandL);
    }
}
