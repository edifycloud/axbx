package net.sk32.axbx.ums.domain.organization;

/**
 * 组织机构
 */
public class OrganizationEntity {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 代码
     */
    private String code;

    /**
     * 机构类别
     */
    private OrgTypeEnum orgType;

    /**
     * 描述
     */
    private String description;

    /**
     * 父节点
     */
    private Long parentId;

    /**
     * 排序
     */
    private Integer sort;
}
