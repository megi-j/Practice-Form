package ge.tbc.steps;
import static org.testng.Assert.assertFalse;
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
        //assertTrue ნიშნავს რომ პირობა უნდა იყოს true, თუ არ არის მაშინ უნდა გამოვიდეს ეს მესიჯი და ტესტი ფეილდება
        //assertFalse ნიშნავს რომ პირობა უნდა იყოს false.
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

    public PracticeFormPageSteps maleGenderCheck(){
        assertTrue(genderMale.isVisible(), "gender Male is not visible");
        assertTrue(genderMale.isEnabled(), "gender Male is not enabled");
        return this;
    }

    public PracticeFormPageSteps femaleGenderCheck(){
        assertTrue(genderFemale.isVisible(), "gender Female is not visible");
        assertTrue(genderFemale.isEnabled(), "gender Female is not enabled");
        return this;
    }

    public PracticeFormPageSteps otherGenderCheck(){
        assertTrue(genderOther.isVisible(), "gender Other is not visible");
        assertTrue(genderOther.isEnabled(), "gender Other is not enabled");
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

    public PracticeFormPageSteps sportHobbyCheck(){
        assertTrue(hobbySport.isVisible(), "Sport hobby is not visible");
        assertTrue(hobbySport.isEnabled(), "Sport hobby is not enabled");
        return this;
    }

    public PracticeFormPageSteps readingHobbyCheck(){
        assertTrue(hobbyReading.isVisible(), "Reading hobby is not visible");
        assertTrue(hobbyReading.isEnabled(), "Reading hobby is not enabled");
        return this;
    }

    public PracticeFormPageSteps musicHobbyCheck(){
        assertTrue(hobbyMusic.isVisible(), "Music hobby is not visible");
        assertTrue(hobbyMusic.isEnabled(), "Music hobby is not enabled");
        return this;
    }

    public PracticeFormPageSteps pictureCheck(){
        assertTrue(uploadPicture.isVisible(), "picture is not visible");
        assertTrue(uploadPicture.isEnabled(), "picture is not enabled");
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

    public PracticeFormPageSteps cityCheck(){
        assertTrue(city.isVisible(), "city is not visible");
        assertTrue(city.isEnabled(), "city should be disabled until state is selected");
        return this;
    }

    public PracticeFormPageSteps submitCheck(){
        assertTrue(submit.isVisible(), "submit is not visible");
        assertTrue(submit.isEnabled(), "submit is not enabled");
        return this;
    }
    public PracticeFormPageSteps clickSubmit(){
        submit.click();
        return this;
    }
    public PracticeFormPageSteps formShouldNotBeSubmitted(){
        boolean isModalVisible = modal.isVisible();
        assertFalse(isModalVisible, "Form was submitted but should not be");
        return this;
    }
    public PracticeFormPageSteps fillFirstName(String name){
        firstName.fill(name);
        return this;
    }
    public PracticeFormPageSteps fillLastName(String name){
        lastName.fill(name);
        return this;
    }
    public PracticeFormPageSteps fillMobile(String number){
        mobile.fill(number);
        return this;
    }
    public PracticeFormPageSteps selectMaleGender(){
        genderMale.click();
        return this;
    }
    public PracticeFormPageSteps formShouldBeSubmitted(){
        assertTrue(modal.isVisible(), "Form was not submitted successfully");
        return this;
    }
    public PracticeFormPageSteps mobileShouldBeInvalid(){
        Boolean isValid = (Boolean) mobile.evaluate("el=>el.checkValidity()"); //el არის მობ ნომრის input
        assertFalse(isValid, "Mobile should be invalid");
        return this;
    }
}
