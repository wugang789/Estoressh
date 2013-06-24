package com.mycompany.entity;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
//导入表结构
public class exportDB {
   public static void main(String args[]){
	   //读取hibernate.cfg.xml
	   Configuration cfg=new Configuration().configure();
	   SchemaExport export=new SchemaExport(cfg);//工具类对象类生成表结构
	   export.create(true, true);
   }
}
