package ge.tbc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PracticeFormPage {
    public Locator firstName, lastName, email, genderMale, genderFemale, genderOther, mobile, dateOfBirth,
            subjects, hobbySport, hobbyReading, hobbyMusic, uploadPicture, address, state, city, submit;

    public PracticeFormPage(Page page){
        this.firstName = page.locator("#firstName");
        this.lastName = page.locator("#lastName");
        this.email = page.locator("#userEmail");
        this.genderMale = page.locator("#gender-radio-1");
        this.genderFemale = page.locator("#gender-radio-2");
        this.genderOther = page.locator("#gender-radio-3");
        this.mobile = page.locator("#userNumber");
        this.dateOfBirth = page.locator("#dateOfBirthInput");
        this.subjects = page.locator("#subjectsInput");
        this.hobbySport = page.locator("#hobbies-checkbox-1");
        this.hobbyReading = page.locator("#hobbies-checkbox-2");
        this.hobbyMusic = page.locator("#hobbies-checkbox-3");
        this.uploadPicture = page.locator("#uploadPicture");
        this.address = page.locator("#currentAddress");
        this.state = page.locator("#react-select-3-input");
        this.city = page.locator("#react-select-4-input");
        this.submit = page.locator("#submit");
    }

}
