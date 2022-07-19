/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestResultRecordController.java
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
import com.bfec.testgenerator.testgenerator.entity.TestResultRecord;
import com.bfec.testgenerator.testgenerator.service.TestResultRecordService;
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
 * 答题记录 控制器
 *
 * @author shenjizhe
 * @date 2021-12-10 09:16:29
 */
@Slf4j
@RestController
@RequestMapping("/test-result-records")
@Api(tags = "答题记录")
public class TestResultRecordController extends BaseController<TestResultRecord> {
    @Autowired
    private TestResultRecordService service;

    @Override
    public BaseService getService() {
        return service;
    }


    /**
     * 答题记录-批量查询
     */
    @ApiOperation(value = "答题记录-批量查询", notes = "")
    @GetMapping("/batch/")
    public Result<List<TestResultRecord>> batchSelect(
            @Parameter String ids
    ) {
        if (ids != null && !ids.isEmpty()) {
            return super.selectByIds(ids);
        } else {
            return super.selectAll();
        }

    }

    /**
     * 答题记录-批量添加
     */
    @ApiOperation(value = "答题记录-批量添加", notes = "")
    @PostMapping("/batch/")
    public Result<Integer> batchInsert(
            @RequestBody List<TestResultRecord> records
    ) {
        return super.insertList(records);
    }

    /**
     * 答题记录-批量删除
     */
    @ApiOperation(value = "答题记录-批量删除", notes = "")
    @DeleteMapping("/batch/")
    public Result<Integer> batchDelete(
            @Parameter String ids
    ) {
        return super.deleteByIds(ids);
    }

    /**
     * 答题记录-添加
     */
    @ApiOperation(value = "答题记录-添加", notes = "")
    @PostMapping("/")
    public Result<Integer> singleInsert(
            @RequestBody TestResultRecord record
    ) {
        return super.insert(record);
    }

    /**
     * 答题记录-修改
     */
    @ApiOperation(value = "答题记录-修改", notes = "")
    @PutMapping("/")
    public Result<Integer> singleUpdate(
            @RequestBody TestResultRecord record
    ) {
        return super.update(record);
    }

    /**
     * 答题记录-删除
     */
    @ApiOperation(value = "答题记录-删除", notes = "")
    @DeleteMapping("/{id}/")
    public Result<Integer> singleDelete(
            @PathVariable Long id
    ) {
        return  super.delete(id);
    }
}
