package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HelloController {
    // TODO 4 zdefiniuj pola hello, msg, foo, wstrzyknij do nich wartości używając @Value

    // TODO 5 utwórz metodę obsługującą GET, "/hello"

    // TODO 7 utwórz metodę obsługującą GET, "/msg"

    // TODO 9 utwórz metodę obsługującą GET, "/foo"
    @Value("foo")
    private String fooVal;
    @Value("msg")
    private String msgVal;
    @Value("hello")
    private String helloVal;

    @GetMapping("/hello")
    public String GetHello(){
        return helloVal;
    }
    @GetMapping("/msg")
    public String GetMsk(){
        return msgVal;
    }
    @GetMapping("/foo")
    public String GetFoo(){
        return fooVal;
    }

}


