# mybatisGeneratorCustom
mybatis逆向工程

使用官方网站的mapper自动生成工具mybatis-generator-core-1.3.2来生成pojo类和mapper映射文件。但与个人有些习惯不一致，
所以对源码做了些修改，修改内容如下：    
	1.生成的*mapper.xml文件中使用4个空格来缩进     
	2.生成的*mapper.xml文件中每个元素间增加一空行，如insert,update,delete等之间增加一空行      
	3.去掉*mapper.xml文件中生成的注释      
	4.根据数据库表名及字段的注释为Java类、属性增加注释，可以在源码org.mybatis.generator.internal.db.DatabaseIntrospector.java类中根据个人情况进行修改    
	5.实现每次生成都覆盖生成文件   
	
以上修改只对mysql5.6和oracle11.2.0测试通过，其他版本未进行测试

使用方式：     
	1.在generatorConfig.xml中配置mapper生成的详细信息，如下：    
		1.1、添加要生成的数据库表    
		1.2、pojo文件所在包路径   
		1.3、mapper文件所在包路径   
	2.运行GeneratorSqlmap类中main方法生成文件   
	3.将生成文件复制到自己工程即可   
    
