package me.algo.sorting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Photos {

    private static final String DELIMITER = ", ";

    public List<String> solve(List<String> photos) {

        Map<String, String> changedFileNames = new HashMap<>();

        Map<String, List<String>> groupByCity = photos.stream()
                .collect(Collectors.groupingBy(photo -> photo.split(DELIMITER)[1]));

        for (Map.Entry<String, List<String>> entry : groupByCity.entrySet()) {
            List<String> files = entry.getValue();

            files.sort((fileName1, fileName2) -> {
                LocalDateTime photoDate1 = findPhotoDate(fileName1);
                LocalDateTime photoDate2 = findPhotoDate(fileName2);

                if (photoDate1.isAfter(photoDate2)) {
                    return 1;
                } else if (photoDate1.isEqual(photoDate2)) {
                    return 0;
                } else {
                    return -1;
                }
            });

            for (int i = 0; i < files.size(); i++) {
                int numberSize = String.valueOf(files.size()).length();
                String originFileName = findFileName(files.get(i));
                String changedName = changeName(originFileName, findCity(files.get(i)), i + 1, numberSize);
                changedFileNames.put(originFileName, changedName);
            }
        }

        List<String> result = photos.stream()
                .map(origin -> changedFileNames.get(origin.split(DELIMITER)[0]))
                .collect(Collectors.toList());

        return result;
    }

    public LocalDateTime findPhotoDate(String fileName) {
        String[] names = fileName.split(DELIMITER);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
        LocalDateTime photoDate = LocalDateTime.parse(names[2], formatter);

        return photoDate;
    }


    public String findFileName(String file) {
        String[] names = file.split(DELIMITER);
        return names[0];
    }

    public String findCity(String file) {
        String[] names = file.split(DELIMITER);
        return names[1];
    }

    public String changeName(String fileName, String city, int fileOrder, int size) {
        String fileExtension = fileName.split("\\.")[1];
        String numbering = String.format("%0" + size + "d", fileOrder);

        StringBuilder sb = new StringBuilder();
        sb.append(city).append(numbering).append(".").append(fileExtension);

        return sb.toString();
    }
}
