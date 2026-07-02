package com.rikkei.coursemanagementsystem.common.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiError {

    private String errorCode;
    private String details;
    private List<String> fieldErrors;
}
