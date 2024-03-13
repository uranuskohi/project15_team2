package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Vice_Dean_Management_Page {

    public Vice_Dean_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //for Add Lesson Program
    @FindBy(id= "controlled-tab-example-tab-lessonProgram")
    public WebElement clickonLessonProgram;

    @FindBy (id= "react-select-3-input")
    public WebElement chooseLesson;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTerm;

    @FindBy(id = "day")
    public WebElement chooseDay;

    @FindBy(id= "startTime")
    public WebElement starTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[1]/div/form/div/div[2]/div[3]/div/button")
    public WebElement submitButtonAddLessonProgram;

    //for Lesson Program List





}
