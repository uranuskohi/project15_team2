package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Lessons_Page {

    public Lessons_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessons;

    @FindBy(id = "lessonName")
    public WebElement lessonNameField;

    @FindBy(id = "compulsory")
    public WebElement compulsoryRadioButton;

    @FindBy(id = "creditScore")
    public WebElement creditScoreField;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButtonForLessons;

    @FindBy(linkText = "Lesson Created")
    public WebElement lessonCreatedVerification;

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[1]")
    public WebElement deleteButtonForLesson;

    @FindBy(linkText = "Lesson Deleted")
    public WebElement deleteLessonVerification;




}
