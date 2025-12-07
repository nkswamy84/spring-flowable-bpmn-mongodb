package org.example.tut.flowable.dto;

import lombok.Value;

@Value
public class ProcessInstanceResponse {
  String processId;
  boolean isEnded;
}
