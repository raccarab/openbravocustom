/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.virtuemart.www.possync;

/**
 *
 * @author Tii
 */
public class WSInfo {

    public static String wsuser;
    public static String wspassword;
    public static String wsurl;
    public static String wsposid;
    public static String wspayid;

    public static String getWspassword() {
        return wspassword;
    }

    public static void setWspassword(String wspassword) {
        WSInfo.wspassword = wspassword;
    }

    public static String getWspayid() {
        return wspayid;
    }

    public static void setWspayid(String wspayid) {
        WSInfo.wspayid = wspayid;
    }

    public static String getWsposid() {
        return wsposid;
    }

    public static void setWsposid(String wsposid) {
        WSInfo.wsposid = wsposid;
    }

    public static String getWsurl() {
        return wsurl;
    }

    public static void setWsurl(String wsurl) {
        WSInfo.wsurl = wsurl;
    }

    public static String getWsuser() {
        return wsuser;
    }

    public static void setWsuser(String wsuser) {
        WSInfo.wsuser = wsuser;
    }

}