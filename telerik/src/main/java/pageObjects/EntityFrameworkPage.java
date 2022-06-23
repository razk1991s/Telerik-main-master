package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EntityFrameworkPage {

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Entity Framework - Binding and CRUD Operations")
    public WebElement ver_Entity_Framework_title;
}
