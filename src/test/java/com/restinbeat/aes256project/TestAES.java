package com.restinbeat.aes256project;


import com.restinbeat.aes256project.util.Aes256;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;

public class TestAES {

    Log log = LogFactory.getLog(getClass());


    @Test
    public void test() throws Exception {

        log.info("encrypt : " + new Aes256().encrypt("1234"));
        log.info("decrypt : " + new Aes256().decrypt("FBN2Kp4jDJs0OaIiUTj8Vw=="));
    }

}
