package Section_31;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

@Test
public void titleCheck() throws MalformedURLException
{
	MutableCapabilities caps = new MutableCapabilities();
	/*options su neophodne na W10 i Chrome 117+*/
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);
	driver.get("https://rahulshettyacademy.com");
	Assert.assertTrue(driver.getTitle().matches("Rahul Shetty Academy"));
}

}
