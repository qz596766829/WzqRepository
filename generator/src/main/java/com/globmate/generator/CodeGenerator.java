package com.globmate.generator;

import com.globmate.generator.config.WebGeneratorConfig;
import com.globmate.generator.model.GenQo;

public class CodeGenerator {
    // 配置
    private static final String tableName = "student";
    private static final String prefix = "";
    private static final String path = "";
    private static final String packageName = "";
    private static final String dbName = "test";

    private static final String author = "virus_plus";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf-8&useSSL=false";
    private static final String username = "";
    private static final String password = "";

/*    private static final String url = "jdbc:mysql://rm-bp162xws1958l5g4zbo.mysql.rds.aliyuncs.com:3306/"+dbName+"?characterEncoding=utf-8&useSSL=false";
    private static final String username = "huixuexi_test";
    private static final String password = "5Qw36RBn6UVGQkyk";*/

    public static void main(String[] args) {
        String rootPath = System.getProperty("user.dir");
        GenQo genQo = new GenQo();
        genQo.setAuthor(author);
        genQo.setTableName(tableName);
        genQo.setProjectPath(rootPath + path);
        genQo.setUrl(url);
        genQo.setUserName(username);
        genQo.setPassword(password);
        genQo.setDaoSwitch(true);
        genQo.setEntitySwitch(true);
        genQo.setIgnoreTabelPrefix(prefix);
        genQo.setProjectPackage(packageName);

        WebGeneratorConfig webGeneratorConfig = new WebGeneratorConfig(genQo);
        webGeneratorConfig.doMpGeneration();
    }

}