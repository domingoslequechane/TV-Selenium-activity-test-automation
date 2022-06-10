import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_automation {
    String email = "fakemail@test.com";
    String password = "1234";

    @Test
    public void loginValidation () {
        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver");
        WebDriver browser = new ChromeDriver();

        browser.get("https://domingoslequechane.github.io/login_page/");
        browser.findElement(By.xpath("/html/body/div/div/div/form/div[1]/input")).click();
        browser.findElement(By.xpath("/html/body/div/div/div/form/div[1]/input")).sendKeys(email, Keys.END);
        browser.findElement(By.xpath("/html/body/div/div/div/form/div[2]/input")).click();
        browser.findElement(By.xpath("/html/body/div/div/div/form/div[2]/input")).sendKeys(password, Keys.END);
        browser.findElement(By.xpath("/html/body/div/div/div/form/div[3]")).click();
    }
}
