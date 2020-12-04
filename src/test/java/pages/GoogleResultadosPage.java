package pages;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class GoogleResultadosPage extends DriverFactory {

    WebDriverWait wait;
    WebElement textoDestaque; //
    String elementoTextoDestaque = "//*[@id=\"mh_tsuid59\"]/div/div/div[2]/h2/span";
    String textoDestaqueCapturado = ""; //

    public void capturaTextoDestaque(){
        wait = new WebDriverWait(pegaDriver(), 15);
        textoDestaque = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementoTextoDestaque)));
        textoDestaqueCapturado = textoDestaque.getText();
        System.out.println(textoDestaqueCapturado);
    }

    public void validaTextoDestaqueEveris(){
        assertTrue("Texto destaque não possui palavra everis", textoDestaqueCapturado.equals("Everis"));
    }

}
