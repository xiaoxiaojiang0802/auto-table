package com.xjkenli.actable.api.annotation;

import com.xjkenli.actable.api.constants.MySqlCharsetConstant;
import com.xjkenli.actable.api.constants.MySqlEngineConstant;

import java.lang.annotation.*;



/**
 * 创建表时的表名
 *
 * @author sunchenbin
 * @version 2016年6月23日 下午6:13:37
 */
//表示注解加在接口、类、枚举等
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {

	/**
	 * 表名
	 * @return 表名
	 */
	String name() default "";

	/**
	 * 表名
	 * @return 表名
	 */
	String value() default "";

	/**
	 * 表注释，也可以使用@TableComment注解代替
	 */
	String comment() default "";

	/**
	 * 表字符集，也可以使用@TableCharset注解代替
	 * 仅支持com.gitee.sunchenbin.mybatis.actable.constants.MySqlCharsetConstant中的枚举字符集
	 */
	MySqlCharsetConstant charset() default MySqlCharsetConstant.DEFAULT;

	/**
	 * 表引擎，也可以使用@TableEngine注解代替
	 * 仅支持com.gitee.sunchenbin.mybatis.actable.constants.MySqlEngineConstant中的存储引擎枚举
	 */
	MySqlEngineConstant engine() default MySqlEngineConstant.DEFAULT;

	/**
	 * 是否开启simple模式配置，默认不开启，开启后Field不写注解@Column也可以采用默认的驼峰转换法创建字段
	 */
	boolean isSimple() default false;

	/**
	 * 需要排除的属性名，排除掉的属性不参与建表
	 */
	String[] excludeFields() default {"serialVersionUID"};
}