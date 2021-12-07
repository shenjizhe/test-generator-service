                 
# 自动出题服务 服务说明文档

## 1. 接口列表

### swagger 地址
http://localhost:8097/doc.html

名称|接口|方法
---|---|---
<a href="#batchSelect">表达式-批量查询</a>|http://localhost:8097/test-expressions/batch/|GET
<a href="#batchInsert">表达式-批量添加</a>|http://localhost:8097/test-expressions/batch/|POST
<a href="#batchDelete">表达式-批量删除</a>|http://localhost:8097/test-expressions/batch/|DELETE
<a href="#singleInsert">表达式-添加</a>|http://localhost:8097/test-expressions/|POST
<a href="#singleUpdate">表达式-修改</a>|http://localhost:8097/test-expressions/|PUT
<a href="#singleDelete">表达式-删除</a>|http://localhost:8097/test-expressions/{id}/|DELETE

## 2. 接口说明

### <A NAME="batchSelect">表达式-批量查询</A>

- [GET] http://localhost:8097/test-expressions/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
ids|String|false|逗号分隔的id(非必填)

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|List&lt;<a href="#TestExpression">TestExpression</a>&gt;||-

### <A NAME="batchInsert">表达式-批量添加</A>

- [POST] http://localhost:8097/test-expressions/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
records|List&lt;<a href="#TestExpression">TestExpression</a>&gt;|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="batchDelete">表达式-批量删除</A>

- [DELETE] http://localhost:8097/test-expressions/batch/
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

### <A NAME="singleInsert">表达式-添加</A>

- [POST] http://localhost:8097/test-expressions/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestExpression">TestExpression</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleUpdate">表达式-修改</A>

- [PUT] http://localhost:8097/test-expressions/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestExpression">TestExpression</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleDelete">表达式-删除</A>

- [DELETE] http://localhost:8097/test-expressions/{id}/
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

### 表达式 <A NAME="TestExpression">TestExpression</A>

名称|类型|说明|示例
---|---|---|---
id|Long|主键|
content|String|内容|
result|String|结果|
index|String|索引|
