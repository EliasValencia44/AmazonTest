package pages;

public class PaginaCursos extends BasePage {
    private String introductionTestingLink ="//a[normalize-space()='Introducci"+"\u00F3"+"n al Testing de Software' and @href]";
    public PaginaCursos(){
        super(driver);
    }

    public void clickIntroduccionTestingLink(){
        clickElement(introductionTestingLink);
    }
    
}
