package com.nttdata.project.log;


import org.junit.Test;
import static org.junit.Assert.*;

public class LogbackConfigXmlTest {
    @Test
    public void testPerformTask() throws Exception {
        LogbackConfigXml logbackConfigXml=new LogbackConfigXml();
        logbackConfigXml.performTask();
    }

}
