package workshop.sb.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static junit.framework.TestCase.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTests {


    @Autowired
    private MockMvc mockMvc;


    @Test
    public void shouldReturnHelloFromProperties() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));
    }

    @Test
    public void shouldReturnMsgFromProperties() throws Exception {
        mockMvc.perform(get("/msg"))
                .andExpect(status().isOk())
                .andExpect(content().string("msg"));
    }

    @Test
    public void shouldReturnFooFromYAML() throws Exception {
            mockMvc.perform(get("/foo"))
                    .andExpect(status().isOk())
                    .andExpect(content().string("foo"));
    }

}

