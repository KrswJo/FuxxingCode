package AgeCounter;

import java.time.LocalDate;

public class AgeCounter {
    private LocalDate curDate;
    private LocalDate birthDate;
    private LocalDate thisYearBirthDate;

    public AgeCounter (LocalDate curDate, LocalDate birthDate){
        this.curDate = curDate;
        this.birthDate = birthDate;
    }

    public int getAge() {
        getThisYearBirthDate();

        if (thisYearBirthDate.isBefore(curDate)){
            return thisYearBirthDate.getYear() - birthDate.getYear();
        }

        return thisYearBirthDate.getYear() - birthDate.getYear()- 1;
    }


    public LocalDate getCurDate() {
        return curDate;
    }

    public void setCurDate(LocalDate curDate) {
        this.curDate = curDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getThisYearBirthDate() {
        if (thisYearBirthDate == null){
            thisYearBirthDate  = LocalDate.of(curDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());
            return thisYearBirthDate;
        }

        return thisYearBirthDate;
    }
}
