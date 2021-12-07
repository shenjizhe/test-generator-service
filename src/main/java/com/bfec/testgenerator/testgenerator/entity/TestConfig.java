/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestConfig.java
 * @Author: JasonShen
 * @Date: 2021-12-07 17:32:28
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
 * 配置 实体
 *
 * @author shenjizhe
 * @data: 2021-12-07 17:32:28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "TestConfig", description = "配置")
@Table(name = "test_config")
public class TestConfig {
    private static final long serialVersionUID = 6278521136969105281L;

    /**
     * 主键
     * id
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键", required = true, dataType = "Integer", example = "0")
    private Integer id;

    /**
     * 关键字
     * key
     */
    @Column(name = "`key`")
    @ApiModelProperty(value = "关键字", required = true, dataType = "String", example = "test")
    private String key;

    /**
     * 标题
     * title
     */
    @Column(name = "`title`")
    @ApiModelProperty(value = "标题", required = true, dataType = "String", example = "test")
    private String title;

    /**
     * 描述
     * description
     */
    @Column(name = "`description`")
    @ApiModelProperty(value = "描述", required = true, dataType = "String", example = "test")
    private String description;

    /**
     * 值
     * value
     */
    @Column(name = "`value`")
    @ApiModelProperty(value = "值", required = true, dataType = "String", example = "test")
    private String value;
}