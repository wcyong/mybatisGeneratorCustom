package org.wcy.gen.model;

/**
 * 消息通知模板
 * 
 * @author wcyong
 * 
 * @date 2015-09-05
 */
public class TNotificationTemplate {
    /**
     * 唯一编号
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 所属系统
     */
    private String system;

    /**
     * 标题
     */
    private String title;

    /**
     * 模板
     */
    private String template;

    /**
     * 删除标记
     */
    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}