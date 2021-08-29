package me.algo.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidAddress {

    public static final String ipv4 =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([1]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([1]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([1]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static final String ipv6 =
            "^([0-9a-f]{0,4})?:|" + "([0-9a-f]{0,4})?:|" +
                    "([0-9a-f]{0,4})?:|" + "([0-9a-f]{0,4})?:|" +
                    "([0-9a-f]{0,4})?:|" + "([0-9a-f]{0,4})?:|" +
                    "([0-9a-f]{0,4})?:|" + "([0-9a-f]{0,4})$";

    public static final Pattern ipv4Pattern = Pattern.compile(ipv4);
    public static final Pattern ipv6Pattern = Pattern.compile(ipv6);

    private String ip4 = "IPv4";
    private String ip6 = "IPv6";
    private String non = "Neither";
    private List<String> result = new ArrayList<>();

    public List<String> solve(List<String> ips){

        for (String ip : ips) {
            if (ip.indexOf(".") > 0) {
                Matcher match = ipv4Pattern.matcher(ip);

                if (match.find()) {
                    result.add(ip4);
                } else {
                    result.add(non);
                }

            } else if (ip.indexOf(":") > 0 || ip.contains("::")) {
                Matcher match = ipv6Pattern.matcher(ip);

                if (match.find()) {
                    result.add(ip6);
                } else {
                    result.add(non);
                }

            } else {
                result.add(non);
            }
        }

        return result;
    }
}
