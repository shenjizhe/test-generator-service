                 
# 自动出题服务 服务说明文档

## 1. 接口列表

### swagger 地址
http://localhost:8097/doc.html

名称|接口|方法
---|---|---
<a href="#batchSelect">题目记录-批量查询</a>|http://localhost:8097/test-subject-records/batch/|GET
<a href="#batchInsert">题目记录-批量添加</a>|http://localhost:8097/test-subject-records/batch/|POST
<a href="#batchDelete">题目记录-批量删除</a>|http://localhost:8097/test-subject-records/batch/|DELETE
<a href="#singleInsert">题目记录-添加</a>|http://localhost:8097/test-subject-records/|POST
<a href="#singleUpdate">题目记录-修改</a>|http://localhost:8097/test-subject-records/|PUT
<a href="#singleDelete">题目记录-删除</a>|http://localhost:8097/test-subject-records/{id}/|DELETE

## 2. 接口说明

### <A NAME="batchSelect">题目记录-批量查询</A>

- [GET] http://localhost:8097/test-subject-records/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
ids|String|false|逗号分隔的id(非必填)

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|List&lt;<a href="#TestSubjectRecord">TestSubjectRecord</a>&gt;||-

### <A NAME="batchInsert">题目记录-批量添加</A>

- [POST] http://localhost:8097/test-subject-records/batch/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
records|List&lt;<a href="#TestSubjectRecord">TestSubjectRecord</a>&gt;|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="batchDelete">题目记录-批量删除</A>

- [DELETE] http://localhost:8097/test-subject-records/batch/
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

### <A NAME="singleInsert">题目记录-添加</A>

- [POST] http://localhost:8097/test-subject-records/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestSubjectRecord">TestSubjectRecord</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleUpdate">题目记录-修改</A>

- [PUT] http://localhost:8097/test-subject-records/
- 请求格式

名称|类型|必填|说明
---|---|---|---
<a href="#public">公共参数</a>|-|-|-
record|<a href="#TestSubjectRecord">TestSubjectRecord</a>|true|

- 响应格式

名称|类型|说明|示例
---|---|---|---
<a href="#public">公共参数</a>|-|-|-|-
-|Integer||-

### <A NAME="singleDelete">题目记录-删除</A>

- [DELETE] http://localhost:8097/test-subject-records/{id}/
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

### 题目记录 <A NAME="TestSubjectRecord">TestSubjectRecord</A>

名称|类型|说明|示例
---|---|---|---
id|Long|记录主键|
subject_id|Integer|题目主键|
title|String|标题|
content|String|内容|
format|String|格式|
difficulty|Integer|难度|
classify|Integer|分类|
varibles|String|值列表|
answer|String|答案|
