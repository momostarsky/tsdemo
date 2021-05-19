package cn.jpxs;

import org.apache.log4j.Logger;

public class ErrorRecord {
    Logger log= Logger.getLogger(ErrorRecord.class);

    public void Test(){
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error nihao 你好!");
        log.fatal("Fatal Message!");
    }
}
