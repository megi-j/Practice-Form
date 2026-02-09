package ge.tbc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PracticeFormPage {
    public Locator firstName, lastName, email, gender, mobile, dateOfBirth,
            subjects, hobbies, picture, address, state;

    public PracticeFormPage(Page page){
        this.firstName = page.locator("#firstName");
        this.lastName = page.locator("#lastName");
        this.email = page.locator("#userEmail");
        this.gender = page.locator("#genterWrapper");  //აქ გარეთა დივს ვიღებ
        this.mobile = page.locator("#userNumber");
        this.dateOfBirth = page.locator("#dateOfBirthInput");
        this.subjects = page.locator("#subjectsContainer");
        this.hobbies = page.locator("#hobbiesWrapper"); //აქ გარეთა დივს ვიღებ
        this.picture = page.locator("#uploadPicture");
        this.address = page.locator("#currentAddress");
        this.state = page.locator("#stateCity-wrapper");
    }

}
