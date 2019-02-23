package com.example.demo.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author AlanSun
 * @date 2019/2/21 17:56
 **/
public class test1 {
    Logger logger = LoggerFactory.getLogger(test1.class);
    public void tezt(){
        logger.error("hhahahahahh", new Exception("dfsdfs"));
    }
}
