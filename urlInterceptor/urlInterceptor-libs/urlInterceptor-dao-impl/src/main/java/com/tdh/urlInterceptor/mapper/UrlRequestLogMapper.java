package com.tdh.urlInterceptor.mapper;

import com.tdh.urlInterceptor.model.UrlRequestLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UrlRequestLogMapper {

    int insert(UrlRequestLog urlInterceptorConfig);

    int insertSelective(UrlRequestLog record);

    UrlRequestLog selectByPrimaryKey(long uid);

    List<UrlRequestLog> selectByCondition(UrlRequestLog record);

    int updateByPrimaryKeySelective(UrlRequestLog record);

    int updateByPrimaryKey(UrlRequestLog record);

    UrlRequestLog getLatestLog(@Param("uri")String uri);

    int updateIsValid(@Param("ip")String ip, @Param("requestURI")String requestURI);
}
