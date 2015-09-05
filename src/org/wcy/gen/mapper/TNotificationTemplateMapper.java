package org.wcy.gen.mapper;

import org.wcy.gen.model.TNotificationTemplate;

public interface TNotificationTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TNotificationTemplate record);

    int insertSelective(TNotificationTemplate record);

    TNotificationTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TNotificationTemplate record);

    int updateByPrimaryKey(TNotificationTemplate record);
}