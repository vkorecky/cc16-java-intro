package cz.codecamp.logger.formatters.json;

import cz.codecamp.logger.LogLevelEnum;

/**
 * Created by vkorecky on 7.10.16.
 */
public class LogEntity {

    private LogLevelEnum lvl;
    private String ts;
    private String msg;
    private String callersClass;
    private String callersMethod;
    private int callersLine;

    public LogEntity() {
    }

    public LogEntity(LogLevelEnum lvl, String ts, String msg, String callersClass, String callersMethod, int callersLine) {
        this.lvl = lvl;
        this.ts = ts;
        this.msg = msg;
        this.callersClass = callersClass;
        this.callersMethod = callersMethod;
        this.callersLine = this.callersLine;
    }

    public LogLevelEnum getLvl() {
        return lvl;
    }

    public void setLvl(LogLevelEnum lvl) {
        this.lvl = lvl;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCallersClass() {
        return callersClass;
    }

    public void setCallersClass(String callersClass) {
        this.callersClass = callersClass;
    }

    public String getCallersMethod() {
        return callersMethod;
    }

    public void setCallersMethod(String callersMethod) {
        this.callersMethod = callersMethod;
    }

    public int getCallersLine() {
        return callersLine;
    }

    public void setCallersLine(int callersLine) {
        this.callersLine = callersLine;
    }

}
