package com.springboot.qunawan.pojo;

public class Detail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.trip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private Integer trip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.place
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private String place;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.hotel
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private String hotel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.food
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private String food;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.id
     *
     * @return the value of detail.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.id
     *
     * @param id the value for detail.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.trip
     *
     * @return the value of detail.trip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public Integer getTrip() {
        return trip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.trip
     *
     * @param trip the value for detail.trip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setTrip(Integer trip) {
        this.trip = trip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.place
     *
     * @return the value of detail.place
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.place
     *
     * @param place the value for detail.place
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.hotel
     *
     * @return the value of detail.hotel
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.hotel
     *
     * @param hotel the value for detail.hotel
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setHotel(String hotel) {
        this.hotel = hotel == null ? null : hotel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.food
     *
     * @return the value of detail.food
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public String getFood() {
        return food;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.food
     *
     * @param food the value for detail.food
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setFood(String food) {
        this.food = food == null ? null : food.trim();
    }
}