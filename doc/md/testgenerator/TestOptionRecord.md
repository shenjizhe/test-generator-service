                 
# 自动出题服务 服务说明文档

## 1. 接口列表

### swagger 地址
http://localhost:8097/doc.html

名称|接口|方法
---|---|---
<a href="#batchSelect">可选项记录-批量查询</a>|http://localhost:8097/test-option-records/batch/|GET
<a href="#batchInsert">可选项记录-批量添加</a>|http://localhost:8097/test-option-records/batch/|POST
<a href="#batchDelete">可选项记录-批量删除</a>|http://localhost:8097/test-option-records/batch/|DELETE
<a href="#singleInsert">可选项记录-添加</a>|http://localhost:8097/test-option-records/|POST
<a href="#singleUpdate">可选项记录-修改</a>|http://localhost:8097/test-option-records/|PUT
<a href="#singleDelete">可选项记录-删除</a>|http://localhost:8097/test-option-records/{id}/|DELETE

## 2. 接口说明

### <A NAME="batchSelect">可选项记录-批量查询</A>

- [GET] http://localhost:8097/test-option-records/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
ids|String|false|逗号分隔的id(非必填)

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|List&lt;<a href="#TestOptionRecord">TestOptionRecord</a>&gt;||-

### <A NAME="batchInsert">可选项记录-批量添加</A>

- [POST] http://localhost:8097/test-option-records/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
records|List&lt;<a href="#TestOptionRecord">TestOptionRecord</a>&gt;|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="batchDelete">可选项记录-批量删除</A>

- [DELETE] http://localhost:8097/test-option-records/batch/
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

### <A NAME="singleInsert">可选项记录-添加</A>

- [POST] http://localhost:8097/test-option-records/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestOptionRecord">TestOptionRecord</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleUpdate">可选项记录-修改</A>

- [PUT] http://localhost:8097/test-option-records/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestOptionRecord">TestOptionRecord</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleDelete">可选项记录-删除</A>

- [DELETE] http://localhost:8097/test-option-records/{id}/
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

### 可选项记录 <A NAME="TestOptionRecord">TestOptionRecord</A>

名称|类型|说明|示例
---|---|---|---
id|Long|主键|
option_id|Long|选项ID|
record_id|Long|记录ID|
content|String|内容|
