package workshop.sb.config.controller.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;
@Service
@Primary
public class GreetServiceFirstImplementation implements GreetService {

    public static String Temp = "first";
    @Override
    public String getMsg() {
        return MSG + Temp;
    }
}
