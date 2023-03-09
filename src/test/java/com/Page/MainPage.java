package com.Page;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //leftSide modules
    @FindBy(xpath = "//span[@class=\"menu-item-link-text\"]")
    public List<WebElement> allModulesOnLeft;
    @FindBy(xpath = "//li[@id=\"bx_left_menu_menu_live_feed\"]")
    public WebElement activityStream;
    @FindBy(id = "bx_left_menu_menu_tasks")
    public WebElement tasks;
    @FindBy(xpath = "//li[@id=\"bx_left_menu_menu_im_messenger\"]")
    public WebElement chatAndCalls;
    @FindBy(xpath = "//li[@id=\"bx_left_menu_menu_all_groups\"]")
    public WebElement workGroups;
    @FindBy(xpath = "//li[@id=\"bx_left_menu_menu_files\"]")
    public WebElement drive;
    @FindBy(xpath = "//li[@id=\"bx_left_menu_menu_calendar\"]")
    public WebElement calender;
    @FindBy(xpath = "//li[@id=\"bx_left_menu_menu_external_mail\"]")
    public WebElement mail;
    @FindBy(xpath = "//li[@id=\"bx_left_menu_menu_contact_center\"]")
    public WebElement contactCenter;
    @FindBy(id = "bx_left_menu_menu_crm_favorite")
    public WebElement CRM;
    @FindBy(id = "bx_left_menu_menu_timeman_sect")
    public WebElement timeAndReports;
    @FindBy(id = "bx_left_menu_menu_company")
    public WebElement employees;
    @FindBy(id = "bx_left_menu_menu_services_sect")
    public WebElement services;
    @FindBy(id = "bx_left_menu_menu_about_sect")
    public WebElement company;
    @FindBy(xpath = "//span[@class=\"menu-favorites-more-text\"]")
    public WebElement more;
    @FindBy(id = "bx_left_menu_menu_openlines")
    public WebElement openChannels;
    @FindBy(id = "bx_left_menu_menu_marketplace_sect")
    public WebElement applications;
    @FindBy(id = "bx_left_menu_menu_bizproc_sect")
    public WebElement workflows;
    @FindBy(xpath = "//div[@id=\"left-menu-more-btn\"]")
    public WebElement hide;
    //topside modules
    @FindBy(xpath = "//div[@class=\"help-block-icon\"]")
    public WebElement questionMark;
    @FindBy(xpath = "//span[@id=\"timeman-block\"]")
    public WebElement timeManBlock;
    @FindBy(xpath = "//span[@id=\"timeman-background\"]")
    public WebElement timeManBackGround;


    //Tab modules Message/Task/Event/Poll/More/
    @FindBy(xpath = "//span[@id=\"feed-add-post-form-tab-message\"]")
    public WebElement messageTab;
    @FindBy(xpath = "//span[@id=\"feed-add-post-form-tab-tasks\"]")
    public WebElement taskTab;
    @FindBy(xpath = "//span[@id=\"feed-add-post-form-tab-calendar\"]")
    public WebElement eventTab;
    @FindBy(xpath = "//span[@id=\"feed-add-post-form-tab-vote\"]")
    public WebElement pollTab;
    @FindBy(xpath = "//span[@id=\"feed-add-post-form-link-text\"]")
    public WebElement moreTab;

    //Modules under moreTab
    @FindBy(xpath = "//span[@class=\"menu-popup-item-text\"]")
    public List<WebElement> moreTab_allModule;
    @FindBy(xpath = "//span[@class=\"menu-popup-item menu-popup-no-icon feed-add-post-form-file feed-add-post-form-file-more \"]")
    public WebElement moreTab_file;
    @FindBy(xpath = "//span[@class=\"menu-popup-item menu-popup-no-icon feed-add-post-form-grat feed-add-post-form-grat-more \"]")
    public WebElement moreTab_appreciation;
    @FindBy(xpath = "//span[@class=\"menu-popup-item menu-popup-no-icon feed-add-post-form-important feed-add-post-form-important-more \"]")
    public WebElement moreTab_announcement;
    @FindBy(xpath = "//span[@class=\"menu-popup-item menu-popup-no-icon feed-add-post-form-lists feed-add-post-form-lists-more \"]")
    public WebElement moreTab_workflow;

    //Modules under MessageTab
    @FindBy(xpath = "//button[@id=\"blog-submit-button-save\"]")
    public WebElement messageTab_sendButton;
    @FindBy(xpath = "//span[.=\"The message title is not specified\"]")
    public WebElement messageTab_errorText;
    @FindBy(xpath = "//body[@contenteditable=\"true\"]")
    public WebElement messageTab_body;
    @FindBy(xpath = "//iframe[@class=\"bx-editor-iframe\"]")
    public WebElement messageTab_iframe;
    @FindBy(xpath = "//div[@class=\"feed-item-wrap\"]//div[@class=\"feed-post-text-block-inner-inner\"]")
    public WebElement activityStream_Text;

    //Modules under Profile Tab
    @FindBy(xpath = "//span[@class=\"menu-popup-item-text\"]")
    public List<WebElement>profileTab_allModules;
    @FindBy(xpath = "//span[@id=\"user-name\"]")
    public WebElement profile;

    @FindBy(xpath = "//span[.=\"My Profile\"]")
    public WebElement myProfile;

}
