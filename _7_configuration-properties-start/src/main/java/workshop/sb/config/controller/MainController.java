package workshop.sb.config.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "test.properties")
@Component
public class MainController {


    @Value("val1")
    String val1;

    @Value("val2")
    String val2;

    @Value("val3")
    String val3;

    public String getVal1()
    {
        return val1;
    }

    public String getVal2()
    {
        return val2;
    }
    public String getVal3()
    {return val3;}

}
