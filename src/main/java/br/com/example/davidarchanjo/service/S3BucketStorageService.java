package br.com.example.davidarchanjo.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.amazonaws.AmazonClientException;

public interface S3BucketStorageService {

    /**
     * Upload file into AWS S3
     *
     * @param keyName
     * @param contentLength
     * @param contentType
     * @param value
     */
    void uploadFile(
        final String bucketName,
        final String keyName, 
        final Long contentLength, 
        final String contentType,
        final InputStream value
    ) throws AmazonClientException;

    /**
     * Downloads file from S3 bucket
     *
     * @param keyName
     * @return {@link java.io.ByteArrayOutputStream}
     */    
    ByteArrayOutputStream downloadFile(
        final String bucketName,
        final String keyName
    ) throws IOException, AmazonClientException;

    /**
     * Get all files from S3 bucket
     *
     * @return {@link java.lang.String}
     */
    List<String> listFiles(final String bucketName) throws AmazonClientException;

    /**
     * Deletes file from S3 bucket
     *
     * @param fileName
     * @throws {@link com.amazonaws.AmazonClientException}
     */
    void deleteFile(
        final String bucketName,
        final String keyName
    ) throws AmazonClientException;

}
