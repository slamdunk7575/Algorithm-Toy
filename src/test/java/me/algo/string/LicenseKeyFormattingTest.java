package me.algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LicenseKeyFormattingTest {

    @DisplayName("라이센스 키 포맷")
    @Test
    void license_key_formatting_test() {
        // given
        String input = "8F3Z-2e-9-wabcdef";
        // String input = "8F3Z-2e-9-w";
        // String input = "8-5g-3-J";

        int k = 4;
        LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();

        // when
        String result = licenseKeyFormatting.solve(input, k);

        // then
        assertThat(result).isEqualTo("8F-3Z2E-9WAB-CDEF");
        // assertThat(result).isEqualTo("8F3Z-2E9W");
        // assertThat(result).isEqualTo("8-5G3J");
    }

}
