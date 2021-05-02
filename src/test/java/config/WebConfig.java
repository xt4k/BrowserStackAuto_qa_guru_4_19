package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${env}.properties")
public interface WebConfig extends Config {

    @Key("enable.vnc")
    @DefaultValue("false")
    boolean isEnableVnc();

    @Key("enable.video")
    @DefaultValue("false")
    boolean isEnableVideo();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();
 /*
    @Key("browser.version")
    @DefaultValue("89")
    String getBrowserVersion( );*/

    @Key("base.url")
        //    @DefaultValue("https://demoqa.com/automation-practice-form")
    String getBaseUrl();

    @Key("remote.driver")
    String getRemoteDriver();

    @Key("server")
        //    @DefaultValue("http://hub-cloud.browserstack.com/wd/hub")
    String getServer();

    @Key("username")
        //    @DefaultValue("vasyaivanov_x2cO65")
    String getUser();

    @Key("access_key")
        // @DefaultValue("NvtaxwxMSa6MZyMcyb8i")
    String getKey();

    @Key("project")
        //    @DefaultValue("Small sample Android Project")
    String getProject();

    @Key("name")
        //    @DefaultValue("some tests name")
    String getTestName();

    @Key("browserstack.debug")
        //    @DefaultValue("true")
    String getDebug();

    @Key("app")
        // @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String getBsApp();

    @Key("device")
        //  @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("os_version")
        //  @DefaultValue("9.0")
    String getOsVer();

    @Key("build")
    @DefaultValue("Junit5 from xt4k for QA_GURU")
    String getBuild();

    @Key("search.query")
    String getQuerySearch();

}
