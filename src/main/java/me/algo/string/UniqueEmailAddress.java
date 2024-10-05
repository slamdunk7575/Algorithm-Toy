package me.algo.string;

import java.util.HashSet;
import java.util.Set;

/**
 * (정리)
 * 1. 이메일은 '로컬네임 + 도메인 네임' 으로 구성된다. (예: testemail@coding.com)
 * 2. 로컬네임에서 '.'은 무시한다.
 * 3. 로컬네임에서 '+' 이후로 나오는 문자열은 무시한다.
 * 4. 도메인 네임은 '.'이 들어가면 고유한 값이다. (예: testemail@cod.ing.com)
 */
public class UniqueEmailAddress {

    public int solve1(String[] emails) {
        // 1. Data Structure
        Set<String> uniqueEmails = new HashSet<>();

        // 2. Algorithm
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            String localName = makeLocalName(email);
            String domainName = makeDomainName(email);

            uniqueEmails.add(sb.append(localName)
                    .append("@")
                    .append(domainName)
                    .toString());
        }

        return uniqueEmails.size();
    }

    private String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder();

        // 예: "test.email+james@coding.com"
        for (int i = 0; i < email.length(); i++) {
            char current = email.charAt(i);

            if (current == '.') {
                continue;
            }

            if (current == '+' || current == '@') {
                break;
            }

            sb.append(email.charAt(i));
        }

        return sb.toString();
    }

    private String makeDomainName(String email) {
        return email.substring(email.indexOf("@") + 1);
    }

    public int solve2(String[] emails) {
        // 1. Data Structure
        Set<String> uniqueEmails = new HashSet<>();

        // 2. for, while
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            String[] parts = email.split("@");
            String[] localName = parts[0].split("\\+");
            uniqueEmails.add(sb.append(localName[0].replace(".", ""))
                    .append("@")
                    .append(parts[1]).toString());
        }

        return uniqueEmails.size();
    }
}
