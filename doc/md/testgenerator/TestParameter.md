                 
# 自动出题服务 服务说明文档

## 1. 接口列表

### swagger 地址
http://localhost:8097/doc.html

名称|接口|方法
---|---|---
<a href="#batchSelect">参数-批量查询</a>|http://localhost:8097/test-parameters/batch/|GET
<a href="#batchInsert">参数-批量添加</a>|http://localhost:8097/test-parameters/batch/|POST
<a href="#batchDelete">参数-批量删除</a>|http://localhost:8097/test-parameters/batch/|DELETE
<a href="#singleInsert">参数-添加</a>|http://localhost:8097/test-parameters/|POST
<a href="#singleUpdate">参数-修改</a>|http://localhost:8097/test-parameters/|PUT
<a href="#singleDelete">参数-删除</a>|http://localhost:8097/test-parameters/{id}/|DELETE

## 2. 接口说明

### <A NAME="batchSelect">参数-批量查询</A>

- [GET] http://localhost:8097/test-parameters/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
ids|String|false|逗号分隔的id(非必填)

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|List&lt;<a href="#TestParameter">TestParameter</a>&gt;||-

### <A NAME="batchInsert">参数-批量添加</A>

- [POST] http://localhost:8097/test-parameters/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
records|List&lt;<a href="#TestParameter">TestParameter</a>&gt;|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="batchDelete">参数-批量删除</A>

- [DELETE] http://localhost:8097/test-parameters/batch/
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

### <A NAME="singleInsert">参数-添加</A>

- [POST] http://localhost:8097/test-parameters/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestParameter">TestParameter</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleUpdate">参数-修改</A>

- [PUT] http://localhost:8097/test-parameters/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestParameter">TestParameter</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleDelete">参数-删除</A>

- [DELETE] http://localhost:8097/test-parameters/{id}/
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

### 参数 <A NAME="TestParameter">TestParameter</A>

名称|类型|说明|示例
---|---|---|---
id|Long|主键|
key|String|关键字|
code|String|代码|
description|String|描述|
type|String|参数类型|
globle|Boolean|是否全局|
