                 
# 自动出题服务 服务说明文档

## 1. 接口列表

### swagger 地址
http://localhost:8097/doc.html

名称|接口|方法
---|---|---
<a href="#batchSelect">配置-批量查询</a>|http://localhost:8097/test-configs/batch/|GET
<a href="#batchInsert">配置-批量添加</a>|http://localhost:8097/test-configs/batch/|POST
<a href="#batchDelete">配置-批量删除</a>|http://localhost:8097/test-configs/batch/|DELETE
<a href="#singleInsert">配置-添加</a>|http://localhost:8097/test-configs/|POST
<a href="#singleUpdate">配置-修改</a>|http://localhost:8097/test-configs/|PUT
<a href="#singleDelete">配置-删除</a>|http://localhost:8097/test-configs/{id}/|DELETE

## 2. 接口说明

### <A NAME="batchSelect">配置-批量查询</A>

- [GET] http://localhost:8097/test-configs/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
ids|String|false|逗号分隔的id(非必填)

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|List&lt;<a href="#TestConfig">TestConfig</a>&gt;||-

### <A NAME="batchInsert">配置-批量添加</A>

- [POST] http://localhost:8097/test-configs/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
records|List&lt;<a href="#TestConfig">TestConfig</a>&gt;|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="batchDelete">配置-批量删除</A>

- [DELETE] http://localhost:8097/test-configs/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
ids|String|false|逗号分隔的id(非必填)

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleInsert">配置-添加</A>

- [POST] http://localhost:8097/test-configs/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestConfig">TestConfig</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleUpdate">配置-修改</A>

- [PUT] http://localhost:8097/test-configs/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestConfig">TestConfig</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleDelete">配置-删除</A>

- [DELETE] http://localhost:8097/test-configs/{id}/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
id|Long|true|记录ID

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-


## 3. 数据定义

### 公共返回值 <A NAME="public">public</A>

名称|类型|说明|示例
---|---|---|---
errcode|Long|错误码( 0为成功 )| 0
message|String|错误描述|成功
data|Object|数据|{"name","jason"}

### 配置 <A NAME="TestConfig">TestConfig</A>

名称|类型|说明|示例
---|---|---|---
id|Integer|主键|
key|String|关键字|
title|String|标题|
description|String|描述|
value|String|值|
