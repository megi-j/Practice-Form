package studentRegistrationFormTests;

import baseTests.BaseTest;
import ge.tbc.steps.PracticeFormPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondHomework extends BaseTest {
    private PracticeFormPageSteps practiceFormPageSteps;

    @BeforeClass
    public void setUpSteps(){
        practiceFormPageSteps = new PracticeFormPageSteps(getPage());
    }
    @Test
    public void checkPracticeForm(){
        practiceFormPageSteps.firstNameCheck();
    }
}
