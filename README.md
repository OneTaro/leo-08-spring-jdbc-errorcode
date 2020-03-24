## spring全家桶系列
### 08 leo-spring-jdbc-errorcode
本例子主要展示 jdbc的异常抽象

spring的JDBC异常抽象

spring会将数据操作的异常转换为DataAccessException
无论使用何种数据访问方式，都能使用一样的异常



通过 SQLErrorCodeSQLExceptionTranslator解析错误码

ErrorCode定义
* org/springframework/jdbc/support/sql-error-codes.xml
* Classpath 下的 sql-error-codes.xml
