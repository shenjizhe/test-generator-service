/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestExpression.java
 * @Author: JasonShen
 * @Date: 2021-12-10 09:16:29
 * @Email: thirdlucky@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bfec.testgenerator.testgenerator.entity;

import javax.persistence.*;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;


/**
 * 表达式 实体
 *
 * @author shenjizhe
 * @data: 2021-12-10 09:16:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "TestExpression", description = "表达式")
@Table(name = "test_expression")
public class TestExpression {
    private static final long serialVersionUID = 8406190761497799308L;

    /**
     * 主键
     * id
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键", required = true, dataType = "Long", example = "0")
    private Long id;

    /**
     * 内容
     * content
     */
    @Column(name = "`content`")
    @ApiModelProperty(value = "内容", required = true, dataType = "String", example = "test")
    private String content;

    /**
     * 结果
     * result
     */
    @Column(name = "`result`")
    @ApiModelProperty(value = "结果", required = true, dataType = "String", example = "test")
    private String result;

    /**
     * 索引
     * index
     */
    @Column(name = "`index`")
    @ApiModelProperty(value = "索引", required = true, dataType = "String", example = "test")
    private String index;
}