package me.algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReorderLogFilesTest {


    @DisplayName("로그 파일의 데이터 정렬")
    @Test
    void reorder_log_files_test() {
        // given
        String[] input = {
                "dig1 8 2 3 1",
                "let7 abc cat",
                "dig1 2 5",
                "let2 good dog book",
                "let3 abc cat"
        };

        ReorderLogFiles reorderLogFiles = new ReorderLogFiles();

        // when
        String[] result = reorderLogFiles.solve(input);

        // then
        assertThat(result).containsExactly(new String[] {
                "let3 abc cat",
                "let7 abc cat",
                "let2 good dog book",
                "dig1 8 2 3 1",
                "dig1 2 5"
        });
    }
}
