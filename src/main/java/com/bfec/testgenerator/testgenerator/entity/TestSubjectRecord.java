/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestSubjectRecord.java
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
 * 题目记录 实体
 *
 * @author shenjizhe
 * @data: 2021-12-07 17:32:28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "TestSubjectRecord", description = "题目记录")
@Table(name = "test_subject_record")
public class TestSubjectRecord {
    private static final long serialVersionUID = 5832269322252180035L;

    /**
     * 记录主键
     * id
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "记录主键", required = true, dataType = "Long", example = "0")
    private Long id;

    /**
     * 题目主键
     * subjectId
     */
    @Column(name = "`subject_id`")
    @ApiModelProperty(value = "题目主键", required = true, dataType = "Integer", example = "0")
    private Integer subjectId;

    /**
     * 标题
     * title
     */
    @Column(name = "`title`")
    @ApiModelProperty(value = "标题", required = true, dataType = "String", example = "test")
    private String title;

    /**
     * 内容
     * content
     */
    @Column(name = "`content`")
    @ApiModelProperty(value = "内容", required = true, dataType = "String", example = "test")
    private String content;

    /**
     * 格式
     * format
     */
    @Column(name = "`format`")
    @ApiModelProperty(value = "格式", required = true, dataType = "String", example = "test")
    private String format;

    /**
     * 难度
     * difficulty
     */
    @Column(name = "`difficulty`")
    @ApiModelProperty(value = "难度", required = true, dataType = "Integer", example = "0")
    private Integer difficulty;

    /**
     * 分类
     * classify
     */
    @Column(name = "`classify`")
    @ApiModelProperty(value = "分类", required = true, dataType = "Integer", example = "0")
    private Integer classify;

    /**
     * 值列表
     * varibles
     */
    @Column(name = "`varibles`")
    @ApiModelProperty(value = "值列表", required = true, dataType = "String", example = "test")
    private String varibles;

    /**
     * 答案
     * answer
     */
    @Column(name = "`answer`")
    @ApiModelProperty(value = "答案", required = true, dataType = "String", example = "test")
    private String answer;
}