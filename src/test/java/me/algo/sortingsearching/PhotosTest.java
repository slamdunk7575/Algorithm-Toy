package me.algo.sortingsearching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PhotosTest {

    @DisplayName("사진 정렬하기")
    @Test
    void photos() {
        // given
        List<String> files = Arrays.asList(
                "loopy.jpg, GangNam, 2013-09-05 14:08:05",
                "ykj.png, JamSil, 2015-06-20 15:13:22",
                "petty.png, GangNam, 2013-09-05 14:07:13",
                "crong.jpg, SaDang, 2015-07-23 08:03:02",
                "poby.jpg, SaDang, 2015-07-22 23:59:59",
                "pororo.jpg, JamSil, 2015-08-05 00:02:03",
                "eddy.png, SaDang, 2015-09-01 12:00:00",
                "kkk.jpg, GangNam, 2013-09-06 15:40:22",
                "aaa.png, GangNam, 2016-02-13 13:33:50",
                "bbb.jpg, GangNam, 2016-01-02 15:12:22",
                "ccc.jpg, GangNam, 2016-01-02 14:34:30",
                "ddd.jpg, GangNam, 2016-01-02 15:15:01",
                "eee.png, GangNam, 2016-01-02 09:49:09",
                "fff.png, GangNam, 2016-01-02 10:55:32",
                "ggg.jpg, GangNam, 2016-02-29 22:13:11"
        );

        Photos photos = new Photos();

        // when
        List<String> result = photos.solve(files);

        // then
        assertThat(result).isEqualTo(Arrays.asList(
                "GangNam02.jpg",
                "JamSil1.png",
                "GangNam01.png",
                "SaDang2.jpg",
                "SaDang1.jpg",
                "JamSil2.jpg",
                "SaDang3.png",
                "GangNam03.jpg",
                "GangNam09.png",
                "GangNam07.jpg",
                "GangNam06.jpg",
                "GangNam08.jpg",
                "GangNam04.png",
                "GangNam05.png",
                "GangNam10.jpg"
        ));
    }

    @DisplayName("파일 이름 변경")
    @Test
    void changeFileName() {
        // given
        String name = "ykj.png, JamSil, 2015-06-20 15:13:22";
        Photos photos = new Photos();

        String fileName = photos.findFileName(name);
        String city = photos.findCity(name);

        // when
        String result = photos.changeName(fileName, city, 2, 2);

        // then
        assertThat(result).isEqualTo("JamSil02.png");
    }

}
