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
    public void checkFirstName(){
        practiceFormPageSteps.firstNameCheck();
    }
    @Test
    public void checkLastName(){
        practiceFormPageSteps.lastNameCheck();
    }
    @Test
    public void checkEmail(){
       practiceFormPageSteps.emailCheck();
    }
    @Test
    public void checkMaleGender(){
        practiceFormPageSteps.maleGenderCheck();
    }
    @Test
    public void checkFemaleGender(){
        practiceFormPageSteps.femaleGenderCheck();
    }
    @Test
    public void checkOtherGender(){
        practiceFormPageSteps.otherGenderCheck();
    }
    @Test
    public void checkMobile(){
        practiceFormPageSteps.mobileCheck();
    }
    @Test
    public void checkDateOfBirth(){
        practiceFormPageSteps.dateOfBirthCheck();
    }
    @Test
    public void checkSubjects(){
        practiceFormPageSteps.subjectsCheck();
    }
    @Test
    public void checkSportHobby(){
        practiceFormPageSteps.sportHobbyCheck();
    }
    @Test
    public void checkReadingHobby(){
        practiceFormPageSteps.readingHobbyCheck();
    }
    @Test
    public void checkMusicHobby(){
        practiceFormPageSteps.musicHobbyCheck();
    }
    @Test
    public void checkPicture(){
        practiceFormPageSteps.pictureCheck();
    }
    @Test
    public void checkAddress(){
        practiceFormPageSteps.addressCheck();
    }
    @Test
    public void checkState(){
        practiceFormPageSteps.stateCheck();
    }
    @Test
    public void checkCity(){
        practiceFormPageSteps.cityCheck();
    }
}
