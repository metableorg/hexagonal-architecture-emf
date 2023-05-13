package org.metable.soccer;

import org.junit.After;
import org.junit.Before;
import org.metable.hex.soccer.driver.DefaultSoccerDslDriver;
import org.metable.hex.soccer.driver.SoccerDslDriver;
import org.metable.hex.soccer.dsl.SoccerDsl;

public class CommonTest {

    protected SoccerDsl dsl;
    protected SoccerDslDriver driver;

    protected void doAfterEachTest() {
    }

    protected void doBeforeEachTest() {
    }

    @Before
    public void setUp() throws Exception {
        driver = new DefaultSoccerDslDriver();
        dsl = new SoccerDsl(driver);

        doBeforeEachTest();
    }

    @After
    public void tearDown() throws Exception {
        driver.dispose();

        doAfterEachTest();
    }
}
