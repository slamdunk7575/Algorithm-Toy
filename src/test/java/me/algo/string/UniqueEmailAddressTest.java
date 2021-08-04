package me.algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueEmailAddressTest {

    @DisplayName("UniqueEmailAddress 테스트")
    @Test
    void unique_email_address_test() {
        // given
        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@cod.ing.com",
                "testemail+tom@cod.ing.com",
                "a@coding.com"
        };

        UniqueEmailAddress uniqueEmailAddress = new UniqueEmailAddress();

        // when
        int emailCount = uniqueEmailAddress.solve1(emails);

        // then
        assertThat(emailCount).isEqualTo(3);
    }

}
