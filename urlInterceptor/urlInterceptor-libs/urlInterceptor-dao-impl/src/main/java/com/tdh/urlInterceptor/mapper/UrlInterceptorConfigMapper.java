package com.tdh.urlInterceptor.mapper;

import com.tdh.urlInterceptor.model.UrlInterceptorConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UrlInterceptorConfigMapper {
    /**
     * 插入拦截器配置文件
     * @param urlInterceptorConfig
     * @return
     */
    int insert(UrlInterceptorConfig urlInterceptorConfig);

    int insertSelective(UrlInterceptorConfig record);

    UrlInterceptorConfig selectByPrimaryKey(@Param("uid") long uid);

    List<UrlInterceptorConfig> selectByCondition(UrlInterceptorConfig record);

    int updateByPrimaryKeySelective(UrlInterceptorConfig record);

    int updateByPrimaryKey(UrlInterceptorConfig record);

    List<UrlInterceptorConfig> findAll();
}
