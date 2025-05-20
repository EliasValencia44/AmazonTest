package pages;

public class PaginaIntroduccionTesting extends BasePage {
    private String introductionTestingLink ="//a[normalize-space()='Programaci\u00F3n y trabajo con c\u00F3digo para Testers' and @href]";

    public PaginaIntroduccionTesting(){
        super(driver);
    }

    public void clickIntroduccionTestingLink(){
        clickElement(introductionTestingLink);
    }
    
}
