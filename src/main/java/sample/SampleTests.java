package sample;


import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
@Log4j
public class SampleTests {
    @Setter(onMethod_=@Autowired)
    private Restaurant restaurant;

    @Test
    public void testExist() {
        BasicConfigurator.configure();

        assertNotNull(restaurant);

        log.info(restaurant);
        log.info("----------------------------------------");
        log.info(restaurant.getChef());
    }
}
