package ScoreCalculator;

public class Score {
    private String subjectName;
    private String grade;

    public double getNumScore(){
        if(grade.equals("A+"))
            return 4.5f;
        if(grade.equals("A"))
            return 4.0f;
        if(grade.equals("B+"))
            return 3.5f;
        if(grade.equals("B"))
            return 3.0f;
        if(grade.equals("C+"))
            return 2.5f;
        if(grade.equals("C"))
            return 2.0f;
        if(grade.equals("D+"))
            return 1.5f;
        if(grade.equals("D"))
            return 1.0f;
        if(grade.equals("F"))
            return 0;
        return 0;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Score(String subjectName, String grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public Score(){
    }
}
