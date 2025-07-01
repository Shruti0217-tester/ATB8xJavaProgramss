package June.ex_06062025_SwitchCondition;

public class Lab044_SwitchCondition_Ex {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome --> execute chrome
        // firefox --> execute firefox
        // edge --> execute edge

        String browser = "chrome";

        switch(browser){
            case "chrome":
                System.out.println("starting the chrome browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium code
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firefox(); // Selenium code
                break;
            case "edge":
                System.out.println("starting the edge browser");
                // Further code to start the Edge
                // Webdriver driver = new Edge(); // Selenium code
                break;
            default:
                System.out.println("I have not idea which browser is this");
        }
    }
}
