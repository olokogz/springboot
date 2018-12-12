package workshop.sb.config.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MainController.class)
@TestPropertySource("classpath:application.properties")
public class MainControllerTest {

    @Autowired
    private MainController mainController;

    @Test
    public void getVal1() {
        String s = mainController.getVal1();
        assertEquals("val1",s);
    }

    @Test
    public void getVal2() {
        String s = mainController.getVal2();
        assertEquals("val2",s);
    }

    @Test
    public void getVal3() {
        String s = mainController.getVal3();
        assertEquals("val3",s);
    }
}