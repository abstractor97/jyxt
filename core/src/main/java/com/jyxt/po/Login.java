package com.jyxt.po;

import java.util.Date;

public class Login {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.id
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.name
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.password
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.phone
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.ip
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.createDate
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.dj
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    private String dj;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.id
     *
     * @return the value of login.id
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.id
     *
     * @param id the value for login.id
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.name
     *
     * @return the value of login.name
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.name
     *
     * @param name the value for login.name
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.password
     *
     * @return the value of login.password
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.password
     *
     * @param password the value for login.password
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.phone
     *
     * @return the value of login.phone
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.phone
     *
     * @param phone the value for login.phone
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.ip
     *
     * @return the value of login.ip
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.ip
     *
     * @param ip the value for login.ip
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.createDate
     *
     * @return the value of login.createDate
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.createDate
     *
     * @param createdate the value for login.createDate
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.dj
     *
     * @return the value of login.dj
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public String getDj() {
        return dj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.dj
     *
     * @param dj the value for login.dj
     *
     * @mbggenerated Mon Jul 17 16:50:23 CST 2017
     */
    public void setDj(String dj) {
        this.dj = dj == null ? null : dj.trim();
    }
}