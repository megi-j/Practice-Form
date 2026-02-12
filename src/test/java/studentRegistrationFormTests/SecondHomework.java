package studentRegistrationFormTests;

import baseTests.BaseTest;
import ge.tbc.data.Constants;
import ge.tbc.steps.PracticeFormPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class SecondHomework extends BaseTest {
    private PracticeFormPageSteps practiceFormPageSteps;

    @BeforeClass
    public void setUpSteps(){
        practiceFormPageSteps = new PracticeFormPageSteps(getPage());
    }
    @Test(priority = 1)
    public void checkFormElementsVisibility(){
        practiceFormPageSteps.firstNameCheck()
                .lastNameCheck()
                .emailCheck()
                .maleGenderCheck()
                .femaleGenderCheck()
                .otherGenderCheck()
                .mobileCheck()
                .dateOfBirthCheck()
                .subjectsCheck()
                .sportHobbyCheck()
                .readingHobbyCheck()
                .musicHobbyCheck()
                .pictureCheck()
                .addressCheck()
                .stateCheck()
                .cityCheck()
                .submitCheck();
    }

    @Test(priority = 2)
    public void requiredFieldsValidationTest(){
        practiceFormPageSteps.clickSubmit()
                .formShouldNotBeSubmitted();

    }
    @Test(priority = 3)
    public void happyPathSubmissionTest(){
        practiceFormPageSteps.fillFirstName(Constants.VALID_FIRST_NAME)
                .fillLastName(Constants.VALID_LAST_NAME)
                .selectMaleGender()
                .fillMobile(Constants.VALID_MOBILE_NUMBER)
                .clickSubmit()
                .formShouldBeSubmitted();
    }
    @Test(priority = 4)
    public void mobileValidation(){
        practiceFormPageSteps.fillFirstName(Constants.VALID_FIRST_NAME)
                .fillLastName(Constants.VALID_LAST_NAME)
                .selectMaleGender()
                .fillMobile(Constants.INVALID_MOBILE_NUMBER)
                .clickSubmit()
                .mobileShouldBeInvalid();
    }

}
