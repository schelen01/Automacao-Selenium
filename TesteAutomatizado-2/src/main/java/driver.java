
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
        //começar a criar o teste
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver(); //precisa importar ALT + ENTER
            driver.get("https://www.saucedemo.com");

            WebElement campoUsuario = driver.findElement(By.id("###")); //alt +enter no Element e no By
            //no ### troque por user-nome, ou procure pelo id no inspecionar
            campoUsuario.sendKeys("standard_user");

            WebElement campoSenha = driver.findElement(By.id("password"));
            campoSenha.sendKeys("secret_sauce");

            WebElement botaoLogin = driver.findElement(By.id("login-button"));
            botaoLogin.click();
        }
    }


