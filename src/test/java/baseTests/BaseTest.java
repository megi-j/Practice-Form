package baseTests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.WaitUntilState;
import ge.tbc.data.Constants;
import org.testng.annotations.BeforeClass;

import java.util.List;
// გვერდის გახსნა მაქვს ცალკე გატანილი, ანუ ცალკე ფოლდერად baseTest
public class BaseTest {
    //ესენი იმისთვის რომ გაიხსნას გვერდი
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    //ეს ნაწილი უნდა გაეშვას ჩვენი ტესტის დაწყებამდე
    @BeforeClass
    //ამ მეთოდში არის ის რაც გვჭირდება გვერდის გასახსნელად
    public void setUp() {
        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setArgs(List.of("--start-maximized"))
        );

        context = browser.newContext(
                new Browser.NewContextOptions().setViewportSize(null)   //გამოიყენოს რეალური window ზომა და არა დეფაულტად რომელიმე ზომა
        );

        page = context.newPage();
        page.navigate(
                Constants.BASE_URL,
                new Page.NavigateOptions()
                        .setTimeout(60_000)    //აქ ტესტი ელოდება 60 წმ გვერდის ჩატვირთვას ,რო გაეშვას
                        .setWaitUntil(WaitUntilState.LOAD)  //სანამ გვერდი ბოლომდე არ ჩაიტვირთება მანამდე დაელოდება
        );

    }
    //ეს ფუნქცია მიახვედრებს რომელ გვერძე ხდება ეს ყველაფერი, ტესტის გაშვებისას მე რომ სხვა გვერძე გადავიდე,
    //ეს ჩემმა ტესტმა მაინც იქ უნდა გააგრძელოს გატესტვა სადაც მივუთითებ და ამას აკეთებს ეს ფუნქცია
    protected Page getPage() {
        return page;
    }
}
