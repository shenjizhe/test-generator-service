/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: BaseController.java
 * @Author: JasonShen
 * @Date: 2021-08-26 16:28:06
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

package com.common.model.mapper;

import com.common.model.Result;

import java.util.List;

/**
 * 基础控制器类
 *
 * @author shenjizhe
 * @data: 2021/9/12 9:59
 */
public abstract class BaseController<T> {

    /**
     * 取得服务
     *
     * @return 服务
     */
    public abstract BaseService<T> getService();

    public Result<Integer> delete(long id) {
        BaseService<T> service = getService();
        int count = service.deleteByPrimaryKey(id);
        return Result.success(count);
    }

    public Result<List<T>> selectByIds(String ids) {
        BaseService<T> service = getService();
        List<T> list = service.selectByIds(ids);
        return Result.success(list);
    }

    public Result<Integer> deleteByIds(String ids) {
        BaseService<T> service = getService();
        int count = service.deleteByIds(ids);
        return Result.success(count);
    }

    public Result<Integer> insert(T record) {
        BaseService<T> service = getService();
        int count = service.insert(record);
        return Result.success(count);
    }

    public Result<Integer> insertList(List<T> records) {
        BaseService<T> service = getService();
        int count = service.insertList(records);
        return Result.success(count);
    }

    public Result<Boolean> exists(long id) {
        BaseService<T> service = getService();
        Boolean exists = service.existsWithPrimaryKey(id);
        return Result.success(exists);
    }

    public Result<List<T>> selectAll() {
        BaseService<T> service = getService();
        List<T> list = service.selectAll();
        return Result.success(list);
    }

    public Result<Integer> selectCount(T record) {
        BaseService<T> service = getService();
        int count = service.selectCount(record);
        return Result.success(count);
    }

    public Result<List<T>> select(T record) {
        BaseService<T> service = getService();
        List<T> list = service.select(record);
        return Result.success(list);
    }

    public Result<T> selectOne(T record) {
        BaseService<T> service = getService();
        T r = service.selectOne(record);
        return Result.success(r);
    }

    public Result<T> select(long id) {
        BaseService<T> service = getService();
        T r = service.selectByPrimaryKey(id);
        return Result.success(r);
    }

    public Result<Integer> update(T record) {
        BaseService<T> service = getService();
        int count = service.updateByPrimaryKey(record);
        return Result.success(count);
    }
}
