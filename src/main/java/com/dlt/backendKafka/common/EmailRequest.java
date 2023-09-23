package com.dlt.backendKafka.common;

import lombok.Data;

@Data
public class EmailRequest {

    private String to;

    private String content;
}
