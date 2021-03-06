package com.ningpai.system.service;

import java.util.List;
import java.util.Map;

import com.ningpai.system.bean.SysDictionary;
import com.ningpai.util.PageBean;

/**
 * 系统字典业务接口
 * 
 * @Description:
 * @author NINGPAI_xiaomm
 * @since 2014-03-20 11:03:23
 * @version V1.0
 */
public interface ISysDictionaryBiz {

    /**
     * 保存系统字典
     * 
     * @param sysDictionary
     *            系统字典对象
     * @return 是否保存成功 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    boolean saveSysDictionary(SysDictionary sysDictionary);

    /**
     * 修改系统字典
     * 
     * @param sysDictionary
     *            待修改系统字典对象
     * @return 更新影响的条数 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    int updateSysDictionary(SysDictionary sysDictionary);

    /**
     * 根据系统字典对象的id查询系统字典对象
     * 
     * @param id
     *            系统字典id
     * @return 系统字典对象 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    SysDictionary getSysDictionaryById(int id);

    /**
     * 根据系统字典对象的id字符集合查询系统字典对象
     * 
     * @param ids
     *            系统字典id字符集合(如果多个使用,分割)
     * @return 系统字典对象集合 @ 自定义异常对象
     * @author system
     * @since 2014-03-20 11:03:23
     */
    List<SysDictionary> getSysDictionaryByIds(String ids);

    /**
     * 根据系统字典对象的id字符集合删除系统字典对象
     * 
     * @param ids
     *            系统字典id字符集合(如果多个使用,分割)
     * @return 删除系统字典对象的数目 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    int deleteSysDictionary(String ids);

    /**
     * 更新系统字典对象的单个字段 其中要包含ids键，保存更新对象的id（多个id以，号分割）
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 更新系统字典对象的数目 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    int updateSysDictionaryFieldById(Map<String, Object> parameter);

    /**
     * 根据系统字典对象的单个字段查询系统字典对象信息总数 其中要包含ids键，保存更新对象的id（多个id以，号分割） 如果查询中有时间条件，则字段名格式为：开始时间（字段名Start），结束时间（字段名End） 如果需要分页查询，开始为：startRowNum，结束为：endRowNum
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 系统字典对象信息总数 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    int getSysDictionaryByFieldTotal(Map<String, Object> parameter);

    /**
     * 根据系统字典对象的单个字段查询系统字典对象信息 其中要包含ids键，保存更新对象的id（多个id以，号分割） 如果查询中有时间条件，则字段名格式为：开始时间（字段名Start），结束时间（字段名End）
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @param pageBean
     *            分页对象
     * @return 系统字典对象的集合 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    PageBean getSysDictionaryByField(Map<String, Object> parameter, PageBean pageBean);

    /**
     * 查询系统字典对象信息总数
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 系统字典对象信息总数 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    int querySysDictionaryTotal(Map<String, Object> parameter);

    /**
     * 分页查询系统字典对象信息 如果需要分页查询，开始为：startRowNum，结束为：endRowNum
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 系统字典对象的集合 @ 自定义异常对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-20 11:03:23
     */
    PageBean querySysDictionaryByPage(Map<String, Object> parameter, PageBean pageBean);

}
