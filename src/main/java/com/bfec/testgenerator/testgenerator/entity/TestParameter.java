/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestParameter.java
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
 * 参数 实体
 *
 * @author shenjizhe
 * @data: 2021-12-10 09:16:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "TestParameter", description = "参数")
@Table(name = "test_parameter")
public class TestParameter {
    private static final long serialVersionUID = 7561273392426100013L;

    /**
     * 主键
     * id
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键", required = true, dataType = "Long", example = "0")
    private Long id;

    /**
     * 关键字
     * key
     */
    @Column(name = "`key`")
    @ApiModelProperty(value = "关键字", required = true, dataType = "String", example = "test")
    private String key;

    /**
     * 代码
     * code
     */
    @Column(name = "`code`")
    @ApiModelProperty(value = "代码", required = true, dataType = "String", example = "test")
    private String code;

    /**
     * 描述
     * description
     */
    @Column(name = "`description`")
    @ApiModelProperty(value = "描述", required = true, dataType = "String", example = "test")
    private String description;

    /**
     * 参数类型
     * type
     */
    @Column(name = "`type`")
    @ApiModelProperty(value = "参数类型", required = true, dataType = "String", example = "test")
    private String type;

    /**
     * 是否全局
     * globle
     */
    @Column(name = "`globle`")
    @ApiModelProperty(value = "是否全局", required = true, dataType = "Boolean", example = "false")
    private Boolean globle;
}