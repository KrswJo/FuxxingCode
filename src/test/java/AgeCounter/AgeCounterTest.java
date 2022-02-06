package AgeCounter;

import AgeCounter.AgeCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AgeCounterTest {
    private AgeCounter age1;
    private AgeCounter age2;
    private LocalDate curDate;


    @BeforeEach
    void setUp() {
        curDate = LocalDate.now();
    }

    @Test
    public void Test1(){
        LocalDate birthDate = LocalDate.of(1999,01,05);

        age1 = new AgeCounter(curDate, birthDate);
        assertEquals(age1.getAge(), 23);
    }

    @Test
    public void Test2(){
        age2 = new AgeCounter(curDate, LocalDate.of(1999, 01, 28));
        assertEquals(age2.getAge(), 22);
    }

}