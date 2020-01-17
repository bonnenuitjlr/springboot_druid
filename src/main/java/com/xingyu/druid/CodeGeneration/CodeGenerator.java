package com.xingyu.druid.CodeGeneration;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @ClassName: MyGenerator
 * @Description TODO : 代码生成
 * @Author: lhb
 * @Date: 2019-03-26 15:30
 * @Version 1.0
 **/
public class CodeGenerator {

    public static void main(String[] args) throws InterruptedException {

        String[] tableNames = {"user"}; // 表名

        String authorName = "xingyu"; // 代码创建人
        String outPutPath = "C:\\"; // 本地生成输出路径
        String packagePath = "com.xingyu.druid"; // 包路径

        String dataBaseUrl = "jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=false&amp;characterEncoding=UTF-8&amp;" +
                "generateSimpleParameterMetadata=true"; // 数据库url
        String dataBaseName = "root";// 数据库名称
        String dataBasePass = "root"; // 数据库密码

        CodeGenerator myGenerator = new CodeGenerator();
        myGenerator.generatorCoding(authorName, outPutPath, dataBaseUrl, dataBaseName, dataBasePass, tableNames, packagePath);
    }

    private void generatorCoding(String authorName, String outPutPath, String url, String name, String pass, String[] tableNames, String
            packagePath) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(outPutPath);
        gc.setFileOverride(true);
        gc.setActiveRecord(false);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setOpen(false);

        gc.setAuthor(authorName);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sDao");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImap");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl(url);
        dsc.setUsername(name);
        dsc.setPassword(pass);

        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setInclude(tableNames);
        // strategy.setInclude(new String[] { "user" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(packagePath);
        //pc.setModuleName("test");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();
    }

}
