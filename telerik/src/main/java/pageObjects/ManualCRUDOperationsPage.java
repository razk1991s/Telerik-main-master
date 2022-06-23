package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManualCRUDOperationsPage {

    @FindBy(how = How.XPATH, using = "//button[@id = \"onetrust-accept-btn-handler\"]")
    public WebElement btn_accept_cookies;
    @FindBy(how = How.XPATH, using = "//h1[@CLASS=\"kd-title\"]")
    public WebElement ver_title;

    //add new rec
    @FindBy(how = How.XPATH, using = "(//span[@class = \"t-text rgButtonText\"])[1]")
    public WebElement btn_add_new_rec;

    //--

    //edit or add new product
    @FindBy(how = How.XPATH, using = " //input[contains(@id,\"ProductName\")]")
    public WebElement txt_Product_Name;

    @FindBy(how = How.XPATH, using = " //input[contains(@id,\"UnitsInStock\")]")
    public WebElement txt_Unit_In_Stock;

    @FindBy(how = How.XPATH, using = " //input[contains(@id,\"UnitPrice\")]")
    public WebElement txt_price;


    //--

    //confirm / cancel
    @FindBy(how = How.XPATH, using = "//span[contains(@class,\"rgUpdateIcon\")]")
    public WebElement btn_confirm;


    @FindBy(how = How.XPATH, using = "//span[contains(@class,\"rgCancelIcon\")]")
    public WebElement btn_cancel;

    //--

    @FindBy(how = How.XPATH, using = "//button[@title= \"Last Page\"]")
    public WebElement btn_last_page;


    //verify after adding - last page

    @FindBy(how = How.XPATH, using = "//tr[@class= \"rgRow\" or @class=\"rgAltRow\"]/td[3]")
    public WebElement ver_new_product_name;

    @FindBy(how = How.XPATH, using = "//tr[@class= \"rgRow\" or @class=\"rgAltRow\"]/td[4]")
    public WebElement ver_new_unit_in_stock;

    @FindBy(how = How.XPATH, using = "//tr[@class= \"rgRow\" or @class=\"rgAltRow\"]/td[5]]")
    public WebElement ver_new_price;
    //--

    //edit - first edit button
    @FindBy(how = How.XPATH, using = "(//span[@class = \"t-font-icon rgIcon rgEditIcon\"])[1]")
    public WebElement edit_first;

    //verify after edit first page

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[3]")
    public WebElement ver_edit_product_name;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[4]")
    public WebElement ver_edit_unit_in_stock;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[5]")
    public WebElement ver_edit_price;
    //--


    //go to Entity Framework Link
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Entity Framework - Binding and CRUD Operations")
    public WebElement btn_Entity_Framework_title;



}
