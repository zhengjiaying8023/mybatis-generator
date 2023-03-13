# 工程简
mybatis逆向工程

# 代码生成步骤

## 第一步：代码依赖引入
      <!--mybatis依赖引入-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.9</version>
        </dependency>
        <!-- mybatis逆向工程依赖-->
        <!-- https://mvnrepository.com/artifact/org.mybatis.generator/mybatis-generator-core -->
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.5</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.49</version>
        </dependency>
    </dependencies>
## 第二步配置xml
 文件名称；mybatis-generator.xml

## 第三步 main执行生成mybatis层级
```
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

```