/*
 * Copyright 2021-2099 the original author or authors.
 *
 * @File: TestParameterServiceImpl.java
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

package com.bfec.testgenerator.testgenerator.service.impl;

import com.bfec.testgenerator.testgenerator.entity.TestParameter;
import com.bfec.testgenerator.testgenerator.mapper.TestParameterMapper;
import com.bfec.testgenerator.testgenerator.service.TestParameterService;
import com.common.model.mapper.MyMapper;
import com.common.model.mapper.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 参数 服务实现
 *
 * @author Jason Shen
 * @version 1.0
 * @date 2021-12-10 09:16:29
 */
@Service
public class TestParameterServiceImpl
    extends BaseServiceImpl<TestParameter>
    implements TestParameterService {

    @Resource
    private TestParameterMapper mapper;

    @Override
    protected MyMapper getMapper() {
    return mapper;
    }
}
