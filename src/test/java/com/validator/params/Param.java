package com.validator.params;

import com.validator.annotation.Date;
import com.validator.annotation.NotNull;

public class Param {

    @NotNull(message = "hello 不允许为空")
    @Date(min = "", max = "")
    String hello;
}
