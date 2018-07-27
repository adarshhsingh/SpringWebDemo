package com.learn.demo.setup_logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  LoggingController :
 *
 *   This is just a rest controller for easy testing of our logging
 *   setup of this package
 *
 *  SpringApplication loads properties from application.properties files in the following locations and adds them to the Spring Environment:
 *
 *   - A /config subdirectory of the current directory
 *   - The current directory
 *   - A classpath /config package
 *   - The classpath root
 *
 *    https://stackoverflow.com/questions/39159831/how-to-know-the-classpath
 */
@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    /**
     *  To provide custom change in log level - we can setup log level in application.properties
     *
     * @return
     */
    @RequestMapping("/testlog")
    public String index() {

        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}
