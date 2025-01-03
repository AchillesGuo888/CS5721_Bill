package com.example.hotel.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentInfo {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.id
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private Long id;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.amount
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private BigDecimal amount;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.order_id
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private Long orderId;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.name
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private String name;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.card_number
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private String cardNumber;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.currency
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private String currency;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.pay_type
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private Byte payType;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.is_deleted
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private Byte isDeleted;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.update_time
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private LocalDateTime updateTime;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.create_time
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private LocalDateTime createTime;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * payment_info.operator
   *
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  private String operator;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.id
   *
   * @return the value of payment_info.id
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public Long getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.id
   *
   * @param id the value for payment_info.id
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.amount
   *
   * @return the value of payment_info.amount
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public BigDecimal getAmount() {
    return amount;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.amount
   *
   * @param amount the value for payment_info.amount
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.order_id
   *
   * @return the value of payment_info.order_id
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public Long getOrderId() {
    return orderId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.order_id
   *
   * @param orderId the value for payment_info.order_id
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.name
   *
   * @return the value of payment_info.name
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public String getName() {
    return name;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.name
   *
   * @param name the value for payment_info.name
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.card_number
   *
   * @return the value of payment_info.card_number
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public String getCardNumber() {
    return cardNumber;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.card_number
   *
   * @param cardNumber the value for payment_info.card_number
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.currency
   *
   * @return the value of payment_info.currency
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public String getCurrency() {
    return currency;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.currency
   *
   * @param currency the value for payment_info.currency
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.pay_type
   *
   * @return the value of payment_info.pay_type
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public Byte getPayType() {
    return payType;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.pay_type
   *
   * @param payType the value for payment_info.pay_type
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setPayType(Byte payType) {
    this.payType = payType;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.is_deleted
   *
   * @return the value of payment_info.is_deleted
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public Byte getIsDeleted() {
    return isDeleted;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.is_deleted
   *
   * @param isDeleted the value for payment_info.is_deleted
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setIsDeleted(Byte isDeleted) {
    this.isDeleted = isDeleted;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.update_time
   *
   * @return the value of payment_info.update_time
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public LocalDateTime getUpdateTime() {
    return updateTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.update_time
   *
   * @param updateTime the value for payment_info.update_time
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.create_time
   *
   * @return the value of payment_info.create_time
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public LocalDateTime getCreateTime() {
    return createTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.create_time
   *
   * @param createTime the value for payment_info.create_time
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column payment_info.operator
   *
   * @return the value of payment_info.operator
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public String getOperator() {
    return operator;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column payment_info.operator
   *
   * @param operator the value for payment_info.operator
   * @mbg.generated Thu Nov 14 19:45:39 GMT 2024
   */
  public void setOperator(String operator) {
    this.operator = operator;
  }
}