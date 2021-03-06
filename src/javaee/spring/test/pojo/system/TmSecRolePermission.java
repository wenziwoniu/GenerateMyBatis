package javaee.spring.test.pojo.system;

import java.util.Date;

public class TmSecRolePermission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_sec_role_permission.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_sec_role_permission.ROLE_CODE
     *
     * @mbggenerated
     */
    private String roleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_sec_role_permission.RES_CODE
     *
     * @mbggenerated
     */
    private String resCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_sec_role_permission.CREATE_USER
     *
     * @mbggenerated
     */
    private Long createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_sec_role_permission.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_sec_role_permission.LAST_MODIFIED_USER
     *
     * @mbggenerated
     */
    private Long lastModifiedUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_sec_role_permission.LAST_MODIFIED_TIME
     *
     * @mbggenerated
     */
    private Date lastModifiedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_sec_role_permission.ID
     *
     * @return the value of tm_sec_role_permission.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_sec_role_permission.ID
     *
     * @param id the value for tm_sec_role_permission.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_sec_role_permission.ROLE_CODE
     *
     * @return the value of tm_sec_role_permission.ROLE_CODE
     *
     * @mbggenerated
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_sec_role_permission.ROLE_CODE
     *
     * @param roleCode the value for tm_sec_role_permission.ROLE_CODE
     *
     * @mbggenerated
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_sec_role_permission.RES_CODE
     *
     * @return the value of tm_sec_role_permission.RES_CODE
     *
     * @mbggenerated
     */
    public String getResCode() {
        return resCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_sec_role_permission.RES_CODE
     *
     * @param resCode the value for tm_sec_role_permission.RES_CODE
     *
     * @mbggenerated
     */
    public void setResCode(String resCode) {
        this.resCode = resCode == null ? null : resCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_sec_role_permission.CREATE_USER
     *
     * @return the value of tm_sec_role_permission.CREATE_USER
     *
     * @mbggenerated
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_sec_role_permission.CREATE_USER
     *
     * @param createUser the value for tm_sec_role_permission.CREATE_USER
     *
     * @mbggenerated
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_sec_role_permission.CREATE_TIME
     *
     * @return the value of tm_sec_role_permission.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_sec_role_permission.CREATE_TIME
     *
     * @param createTime the value for tm_sec_role_permission.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_sec_role_permission.LAST_MODIFIED_USER
     *
     * @return the value of tm_sec_role_permission.LAST_MODIFIED_USER
     *
     * @mbggenerated
     */
    public Long getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_sec_role_permission.LAST_MODIFIED_USER
     *
     * @param lastModifiedUser the value for tm_sec_role_permission.LAST_MODIFIED_USER
     *
     * @mbggenerated
     */
    public void setLastModifiedUser(Long lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_sec_role_permission.LAST_MODIFIED_TIME
     *
     * @return the value of tm_sec_role_permission.LAST_MODIFIED_TIME
     *
     * @mbggenerated
     */
    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_sec_role_permission.LAST_MODIFIED_TIME
     *
     * @param lastModifiedTime the value for tm_sec_role_permission.LAST_MODIFIED_TIME
     *
     * @mbggenerated
     */
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
}