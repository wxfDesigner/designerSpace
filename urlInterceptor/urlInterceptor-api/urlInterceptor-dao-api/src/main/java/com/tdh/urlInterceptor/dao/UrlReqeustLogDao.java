package com.tdh.urlInterceptor.dao;

import com.tdh.urlInterceptor.model.UrlRequestLog;

import java.util.List;

/**
 * 拦截器日志dao
 */
public interface UrlReqeustLogDao {
    int insert(UrlRequestLog urlInterceptorConfig);

    int insertSelective(UrlRequestLog record);

    UrlRequestLog selectByPrimaryKey(long uid);

    List<UrlRequestLog> selectByCondition(UrlRequestLog record);

    int updateByPrimaryKeySelective(UrlRequestLog record);

    int updateByPrimaryKey(UrlRequestLog record);

    UrlRequestLog getLatestLog(String uri);

    int updateIsValid(String ip, String requestURI);
}
