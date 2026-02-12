package ge.tbc.steps;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.microsoft.playwright.Page;
import ge.tbc.pages.PracticeFormPage;
import org.testng.Assert;

public class PracticeFormPageSteps extends PracticeFormPage {
    private final Page page;

    public PracticeFormPageSteps(Page page){
        super(page);
        this.page = page;
    }

    public PracticeFormPageSteps firstNameCheck(){
        //assertTrue ნიშნავს რომ პირობა უნდა იყოს true, თუ არ არის მაშინ უნდა გამოვიდეს ეს მესიჯი და ტესტი ფეილდება
        //assertFalse ნიშნავს რომ პირობა უნდა იყოს false.
        Assert.assertTrue(firstName.isVisible(), "First name input is not visible");
        Assert.assertTrue(firstName.isEnabled(), "First name input is not enabled");
        return this;
    }

    public PracticeFormPageSteps lastNameCheck(){
        Assert.assertTrue(lastName.isVisible(), "Last name input is not visible");
        Assert.assertTrue(lastName.isEnabled(), "Last name input is not enabled");
        return this;
    }

    public PracticeFormPageSteps emailCheck(){
        Assert.assertTrue(email.isVisible(), "email input is not visible");
        Assert.assertTrue(email.isEnabled(), "email input is not enabled");
        return this;
    }

    public PracticeFormPageSteps maleGenderCheck(){
        Assert.assertTrue(genderMale.isVisible(), "gender Male is not visible");
        Assert.assertTrue(genderMale.isEnabled(), "gender Male is not enabled");
        return this;
    }

    public PracticeFormPageSteps femaleGenderCheck(){
        Assert.assertTrue(genderFemale.isVisible(), "gender Female is not visible");
        Assert.assertTrue(genderFemale.isEnabled(), "gender Female is not enabled");
        return this;
    }

    public PracticeFormPageSteps otherGenderCheck(){
        Assert.assertTrue(genderOther.isVisible(), "gender Other is not visible");
        Assert.assertTrue(genderOther.isEnabled(), "gender Other is not enabled");
        return this;
    }

    public PracticeFormPageSteps mobileCheck(){
        Assert.assertTrue(mobile.isVisible(), "mobile is not visible");
        Assert.assertTrue(mobile.isEnabled(), "mobile is not enabled");
        return this;
    }

    public PracticeFormPageSteps dateOfBirthCheck(){
        Assert.assertTrue(dateOfBirth.isVisible(), "date of birth is not visible");
        Assert.assertTrue(dateOfBirth.isEnabled(), "date of birth is not enabled");
        return this;
    }

    public PracticeFormPageSteps subjectsCheck(){
        Assert.assertTrue(subjects.isVisible(), "subjects is not visible");
        Assert.assertTrue(subjects.isEnabled(), "subjects is not enabled");
        return this;
    }

    public PracticeFormPageSteps sportHobbyCheck(){
        Assert.assertTrue(hobbySport.isVisible(), "Sport hobby is not visible");
        Assert.assertTrue(hobbySport.isEnabled(), "Sport hobby is not enabled");
        return this;
    }

    public PracticeFormPageSteps readingHobbyCheck(){
        Assert.assertTrue(hobbyReading.isVisible(), "Reading hobby is not visible");
        Assert.assertTrue(hobbyReading.isEnabled(), "Reading hobby is not enabled");
        return this;
    }

    public PracticeFormPageSteps musicHobbyCheck(){
        Assert.assertTrue(hobbyMusic.isVisible(), "Music hobby is not visible");
        Assert.assertTrue(hobbyMusic.isEnabled(), "Music hobby is not enabled");
        return this;
    }

    public PracticeFormPageSteps pictureCheck(){
        Assert.assertTrue(uploadPicture.isVisible(), "picture is not visible");
        Assert.assertTrue(uploadPicture.isEnabled(), "picture is not enabled");
        return this;
    }

    public PracticeFormPageSteps addressCheck(){
        Assert.assertTrue(address.isVisible(), "address is not visible");
        Assert.assertTrue(address.isEnabled(), "address is not enabled");
        return this;
    }

    public PracticeFormPageSteps stateCheck(){
        Assert.assertTrue(state.isVisible(), "state is not visible");
        Assert.assertTrue(state.isEnabled(), "state is not enabled");
        return this;
    }

    public PracticeFormPageSteps cityCheck(){
        Assert.assertTrue(city.isVisible(), "city is not visible");
        Assert.assertTrue(city.isEnabled(), "city should be disabled until state is selected");
        return this;
    }

    public PracticeFormPageSteps submitCheck(){
        Assert.assertTrue(submit.isVisible(), "submit is not visible");
        Assert.assertTrue(submit.isEnabled(), "submit is not enabled");
        return this;
    }
    public PracticeFormPageSteps clickSubmit(){
        submit.click();
        return this;
    }
    public PracticeFormPageSteps formShouldNotBeSubmitted(){
        boolean isModalVisible = modal.isVisible();
        Assert.assertFalse(isModalVisible, "Form was submitted but should not be");
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
        Assert.assertTrue(modal.isVisible(), "Form was not submitted successfully");
        return this;
    }
    public PracticeFormPageSteps mobileShouldBeInvalid(){
        Boolean isValid = (Boolean) mobile.evaluate("el=>el.checkValidity()"); //el არის მობ ნომრის input
        Assert.assertFalse(isValid, "Mobile should be invalid");
        return this;
    }
}
