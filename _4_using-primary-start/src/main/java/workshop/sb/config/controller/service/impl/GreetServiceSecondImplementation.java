package workshop.sb.config.controller.service.impl;

import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;

@Service
public class GreetServiceSecondImplementation implements GreetService {
    private String Msg = "jakis tam string";
    @Override
    public String getMsg() {
        return Msg+"|Second";
    }
}
