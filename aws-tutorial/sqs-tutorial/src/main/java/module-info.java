import com.saman.tutorial.aws.service.SqsService;
import com.saman.tutorial.aws.impl.SqsServiceImpl;

module sqs.tutorial {
    exports com.saman.tutorial.aws.service;
    exports com.saman.tutorial.aws.impl;
    exports com.saman.tutorial.aws.utils;

    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.regions;
    requires software.amazon.awssdk.services.sqs;
    requires vavr;

    uses SqsService;
    provides SqsService with SqsServiceImpl;
}