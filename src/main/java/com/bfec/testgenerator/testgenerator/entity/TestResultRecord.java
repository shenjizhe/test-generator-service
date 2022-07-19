/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestResultRecord.java
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
 * 答题记录 实体
 *
 * @author shenjizhe
 * @data: 2021-12-10 09:16:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "TestResultRecord", description = "答题记录")
@Table(name = "test_result_record")
public class TestResultRecord {
    private static final long serialVersionUID = 1180165349258740558L;

    /**
     * 主键
     * id
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键", required = true, dataType = "Long", example = "0")
    private Long id;

    /**
     * 题目ID
     * subjectId
     */
    @Column(name = "`subject_id`")
    @ApiModelProperty(value = "题目ID", required = true, dataType = "Long", example = "0")
    private Long subjectId;

    /**
     * 结果ID
     * resultId
     */
    @Column(name = "`result_id`")
    @ApiModelProperty(value = "结果ID", required = true, dataType = "Long", example = "0")
    private Long resultId;
}