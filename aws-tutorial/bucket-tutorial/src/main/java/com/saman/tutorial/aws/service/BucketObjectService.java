package com.saman.tutorial.aws.service;

import software.amazon.awssdk.services.s3.model.DeleteObjectsResponse;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;

import java.util.Optional;

/**
 * @author Saman Alishiri, samanalishiri@gmail.com
 */
public interface BucketObjectService extends Bean {

    Optional<PutObjectResponse> putOneObject(String bucketName, String objectKey, byte[] object);

    byte[] getOneObject(String bucketName, String objectKey);

    Optional<DeleteObjectsResponse> deleteOneObject(String bucketName, String objectKey);

}
