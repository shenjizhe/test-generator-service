/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestExpressionController.java
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

package com.bfec.testgenerator.testgenerator.controller;

import com.common.model.Result;
import com.bfec.testgenerator.testgenerator.entity.TestExpression;
import com.bfec.testgenerator.testgenerator.service.TestExpressionService;
import com.common.model.mapper.BaseController;
import com.common.model.mapper.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 表达式 控制器
 *
 * @author shenjizhe
 * @date 2021-12-10 09:16:29
 */
@Slf4j
@RestController
@RequestMapping("/test-expressions")
@Api(tags = "表达式")
public class TestExpressionController extends BaseController<TestExpression> {
    @Autowired
    private TestExpressionService service;

    @Override
    public BaseService getService() {
        return service;
    }


    /**
     * 表达式-批量查询
     */
    @ApiOperation(value = "表达式-批量查询", notes = "")
    @GetMapping("/batch/")
    public Result<List<TestExpression>> batchSelect(
            @Parameter String ids
    ) {
        if (ids != null && !ids.isEmpty()) {
            return super.selectByIds(ids);
        } else {
            return super.selectAll();
        }

    }

    /**
     * 表达式-批量添加
     */
    @ApiOperation(value = "表达式-批量添加", notes = "")
    @PostMapping("/batch/")
    public Result<Integer> batchInsert(
            @RequestBody List<TestExpression> records
    ) {
        return super.insertList(records);
    }

    /**
     * 表达式-批量删除
     */
    @ApiOperation(value = "表达式-批量删除", notes = "")
    @DeleteMapping("/batch/")
    public Result<Integer> batchDelete(
            @Parameter String ids
    ) {
        return super.deleteByIds(ids);
    }

    /**
     * 表达式-添加
     */
    @ApiOperation(value = "表达式-添加", notes = "")
    @PostMapping("/")
    public Result<Integer> singleInsert(
            @RequestBody TestExpression record
    ) {
        return super.insert(record);
    }

    /**
     * 表达式-修改
     */
    @ApiOperation(value = "表达式-修改", notes = "")
    @PutMapping("/")
    public Result<Integer> singleUpdate(
            @RequestBody TestExpression record
    ) {
        return super.update(record);
    }

    /**
     * 表达式-删除
     */
    @ApiOperation(value = "表达式-删除", notes = "")
    @DeleteMapping("/{id}/")
    public Result<Integer> singleDelete(
            @PathVariable Long id
    ) {
        return  super.delete(id);
    }
}
