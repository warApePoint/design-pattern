package com.warape.designpattern.proxy.staticproxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wan
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestInfo<T> {

    private String name;

    private Long time;

    private T result;
}
