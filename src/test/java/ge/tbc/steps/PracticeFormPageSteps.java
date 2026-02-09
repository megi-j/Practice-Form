package ge.tbc.steps;
import static org.testng.Assert.assertTrue;

import com.microsoft.playwright.Page;
import ge.tbc.pages.PracticeFormPage;

public class PracticeFormPageSteps extends PracticeFormPage {
    private final Page page;

    public PracticeFormPageSteps(Page page){
        super(page);
        this.page = page;
    }

    public PracticeFormPageSteps firstNameCheck(){
        assertTrue(firstName.isVisible(), "First name input is not visible");
        assertTrue(firstName.isEnabled(), "First name input is not enabled");
        return this;
    }

    public PracticeFormPageSteps lastNameCheck(){
        assertTrue(lastName.isVisible(), "Last name input is not visible");
        assertTrue(lastName.isEnabled(), "Last name input is not enabled");
        return this;
    }

    public PracticeFormPageSteps emailCheck(){
        assertTrue(email.isVisible(), "email input is not visible");
        assertTrue(email.isEnabled(), "email input is not enabled");
        return this;
    }

    public PracticeFormPageSteps genderCheck(){
        assertTrue(gender.isVisible(), "gender is not visible");
        assertTrue(gender.isEnabled(), "gender is not enabled");
        return this;
    }

    public PracticeFormPageSteps mobileCheck(){
        assertTrue(mobile.isVisible(), "mobile is not visible");
        assertTrue(mobile.isEnabled(), "mobile is not enabled");
        return this;
    }

    public PracticeFormPageSteps dateOfBirthCheck(){
        assertTrue(dateOfBirth.isVisible(), "date of birth is not visible");
        assertTrue(dateOfBirth.isEnabled(), "date of birth is not enabled");
        return this;
    }

    public PracticeFormPageSteps subjectsCheck(){
        assertTrue(subjects.isVisible(), "subjects is not visible");
        assertTrue(subjects.isEnabled(), "subjects is not enabled");
        return this;
    }

    public PracticeFormPageSteps hobbiesCheck(){
        assertTrue(hobbies.isVisible(), "hobbies is not visible");
        assertTrue(hobbies.isEnabled(), "hobbies is not enabled");
        return this;
    }

    public PracticeFormPageSteps pictureCheck(){
        assertTrue(picture.isVisible(), "picture is not visible");
        assertTrue(picture.isEnabled(), "picture is not enabled");
        return this;
    }

    public PracticeFormPageSteps addressCheck(){
        assertTrue(address.isVisible(), "address is not visible");
        assertTrue(address.isEnabled(), "address is not enabled");
        return this;
    }

    public PracticeFormPageSteps stateCheck(){
        assertTrue(state.isVisible(), "state is not visible");
        assertTrue(state.isEnabled(), "state is not enabled");
        return this;
    }
}
