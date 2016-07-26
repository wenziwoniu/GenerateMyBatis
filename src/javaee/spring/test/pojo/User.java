package javaee.spring.test.pojo;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.LOGIN_ACCOUNT
     *
     * @mbggenerated
     */
    private String loginAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.PASSWORD
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.CREATE_USER
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.LAST_MODIFIED_USER
     *
     * @mbggenerated
     */
    private String lastModifiedUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.LAST_MODIFIED_TIME
     *
     * @mbggenerated
     */
    private Date lastModifiedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ID
     *
     * @return the value of user.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ID
     *
     * @param id the value for user.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.LOGIN_ACCOUNT
     *
     * @return the value of user.LOGIN_ACCOUNT
     *
     * @mbggenerated
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.LOGIN_ACCOUNT
     *
     * @param loginAccount the value for user.LOGIN_ACCOUNT
     *
     * @mbggenerated
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.PASSWORD
     *
     * @return the value of user.PASSWORD
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.PASSWORD
     *
     * @param password the value for user.PASSWORD
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.CREATE_USER
     *
     * @return the value of user.CREATE_USER
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.CREATE_USER
     *
     * @param createUser the value for user.CREATE_USER
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.CREATE_TIME
     *
     * @return the value of user.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.CREATE_TIME
     *
     * @param createTime the value for user.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.LAST_MODIFIED_USER
     *
     * @return the value of user.LAST_MODIFIED_USER
     *
     * @mbggenerated
     */
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.LAST_MODIFIED_USER
     *
     * @param lastModifiedUser the value for user.LAST_MODIFIED_USER
     *
     * @mbggenerated
     */
    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser == null ? null : lastModifiedUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.LAST_MODIFIED_TIME
     *
     * @return the value of user.LAST_MODIFIED_TIME
     *
     * @mbggenerated
     */
    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.LAST_MODIFIED_TIME
     *
     * @param lastModifiedTime the value for user.LAST_MODIFIED_TIME
     *
     * @mbggenerated
     */
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
}