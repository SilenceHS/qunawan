package com.springboot.qunawan.pojo;

public class Place {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column place.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column place.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column place.city
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private Integer city;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column place.id
     *
     * @return the value of place.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column place.id
     *
     * @param id the value for place.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column place.name
     *
     * @return the value of place.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column place.name
     *
     * @param name the value for place.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column place.city
     *
     * @return the value of place.city
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public Integer getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column place.city
     *
     * @param city the value for place.city
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setCity(Integer city) {
        this.city = city;
    }
}