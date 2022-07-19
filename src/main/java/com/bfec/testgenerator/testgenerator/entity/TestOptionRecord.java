/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestOptionRecord.java
 * @Author: JasonShen
 * @Date: 2021-12-10 09:16:28
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
 * 可选项记录 实体
 *
 * @author shenjizhe
 * @data: 2021-12-10 09:16:28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "TestOptionRecord", description = "可选项记录")
@Table(name = "test_option_record")
public class TestOptionRecord {
    private static final long serialVersionUID = 271250804613984254L;

    /**
     * 主键
     * id
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键", required = true, dataType = "Long", example = "0")
    private Long id;

    /**
     * 选项ID
     * optionId
     */
    @Column(name = "`option_id`")
    @ApiModelProperty(value = "选项ID", required = true, dataType = "Long", example = "0")
    private Long optionId;

    /**
     * 记录ID
     * recordId
     */
    @Column(name = "`record_id`")
    @ApiModelProperty(value = "记录ID", required = true, dataType = "Long", example = "0")
    private Long recordId;

    /**
     * 内容
     * content
     */
    @Column(name = "`content`")
    @ApiModelProperty(value = "内容", required = true, dataType = "String", example = "test")
    private String content;
}