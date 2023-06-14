package MNarvaez;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserActions {

    private  String titulo;

    @BeforeEach
    public preparacionTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


    }


    @AfterEach



    @Test void browserActions(){

        //preparar el webdriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //cargar una pagina

        driver.get("https://www.easy.com.ar");

        titulo = driver.getTitle();
        System.out.println("el titulo del sitio es " + titulo);

        //maximizar browser
        driver.manage().window().maximize();

        //redireccionar a otra pagina
        driver.navigate().to("https://www.selenium.dev");

        //refresh
        driver.navigate().refresh();


        //volver a google
        driver.navigate().back();
    }

    @Test
    void  crearCuenta(){
        driver.get("https://open.spotify.com");

        By locatorBtnIniciarSesion = By.xpath()
    }
}
