package br.com.example.davidarchanjo.enumeration;

import java.util.Arrays;

import org.springframework.http.MediaType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.val;

@Getter
@AllArgsConstructor(access = lombok.AccessLevel.PACKAGE)
public enum FileMediaType {

    JPG("jpg", MediaType.IMAGE_JPEG),
    JPEG("jpeg", MediaType.IMAGE_JPEG),
    TXT("txt", MediaType.TEXT_PLAIN),
    PNG("png", MediaType.IMAGE_PNG),
    PDF("pdf", MediaType.APPLICATION_PDF);

    private String extension;
    private MediaType mediaType;

    public static MediaType fromFilename(String fileName) {
        val dotIndex = fileName.lastIndexOf('.');
        val fileExtension = (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
        return Arrays.stream(values())
            .filter(e -> e.getExtension().equals(fileExtension))
            .findFirst()
            .map(FileMediaType::getMediaType)
            .orElse(MediaType.APPLICATION_OCTET_STREAM);
    }

}