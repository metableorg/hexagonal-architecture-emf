package org.metable.hex.ch01;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.metable.hex.ch01.framework.adapters.input.stdin.RouterViewCLIAdapter;

public class Chapter01Examples {

    private ByteArrayOutputStream result;
    private PrintStream writer;
    private RouterViewCLIAdapter commandLineInterface;

    @Before
    public void setUp() throws Exception {
        result = new ByteArrayOutputStream();
        writer = new PrintStream(result);
        commandLineInterface = new RouterViewCLIAdapter();
    }

    @After
    public void tearDown() throws Exception {
        writer.close();
    }

    @Test
    public void queryForCoreRouters() {
        // Arrange.
        final var type = "CORE";

        // Act.
        commandLineInterface.prettyPrint(commandLineInterface.obtainRelatedRouters(type), writer);

        // Assert.
        // @formatter:off
        Assert.assertEquals(

            "Router [type=CORE, id=b317cb8d-b88f-4d6e-b478-dc5b3530ba1c]\r\n" +
            "Router [type=CORE, id=4bc7481d-c275-433d-a407-8b82a181d88d]\r\n" +
            "Router [type=CORE, id=06cabbb1-f568-40c6-b59d-ed4037aaf7bd]\r\n" +
            "Router [type=CORE, id=6ebc0806-94fc-40b0-bc59-6595bbfa94b5]\r\n" +
            "Router [type=CORE, id=76275d7a-670e-47b4-b275-89b5b9c8be44]\r\n",
            
            result.toString());
        // @formatter:on
    }

    @Test
    public void queryForEdgeRouters() {
        // Arrange.
        final var type = "EDGE";

        // Act.
        commandLineInterface.prettyPrint(commandLineInterface.obtainRelatedRouters(type), writer);

        // Assert.
        // @formatter:off
        Assert.assertEquals(

            "Router [type=EDGE, id=641e5bbc-383c-4e5d-9aa8-8306bd84c32a]\r\n" +
            "Router [type=EDGE, id=d068d37b-5129-4ba3-a6b0-9c1ab24ec178]\r\n" +
            "Router [type=EDGE, id=c0761342-5d7b-4217-bf09-d49c778872a6]\r\n" +
            "Router [type=EDGE, id=4c5d9e75-c928-4f48-8306-47cacbbe362b]\r\n" +
            "Router [type=EDGE, id=b8d871bc-3feb-4d31-b028-0d6e08c1a722]\r\n",
            
            result.toString());
        // @formatter:on
    }
}
