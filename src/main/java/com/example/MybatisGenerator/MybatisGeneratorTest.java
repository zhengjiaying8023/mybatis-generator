package com.example.MybatisGenerator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * mybatis生成项目代码的执行代码
 */
public class MybatisGeneratorTest {
	public static void main(String[] args) throws Exception {
		   List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
//FileNotFoundException: mybatis-generator.xml 路径更详细就可以了
		   File configFile = new File("src/main/resources/mybatis-generator.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
	}
}
