package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Satir paylasimi yapilmali conflict olusmamasi icin
    //Ahsen
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;
















    //Zulfiye


}
