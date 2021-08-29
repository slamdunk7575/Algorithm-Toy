package me.algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAddressTest {

    @DisplayName("유효한 IP")
    @Test
    void valid_address() {
        // given
        List<String> ips = Arrays.asList("23.45.12.75", "0.12.34.56",
                "2001:db8:0:0:0:ff00:42:8329", "0000:0000:0000:0000:0000:0000:0001", "::1",
                "000.012.234.23", ".213.123.23.32", "23.45.22.32.");
        // 1:22:333:4444 -> Neither 가 나오도록 수정이 필요

        ValidAddress validAddress = new ValidAddress();

        // when
        List<String> result = validAddress.solve(ips);

        // then
        assertThat(result).containsExactly("IPv4", "IPv4",
                "IPv6", "IPv6", "IPv6",
                "Neither", "Neither", "Neither");
    }
}
