package com.sxhy.saas.entity.simpleuser;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "s_user")
public class SimpleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "s_open_id")
    private String sOpenId;

    @Column(name = "s_nick_name")
    private String sNickName;

    @Column(name = "s_gender")
    private Integer sGender;

    @Column(name = "s_province")
    private String sProvince;

    @Column(name = "s_city")
    private String sCity;

    @Column(name = "s_country")
    private String sCountry;

    @Column(name = "s_head_img_url")
    private String sHeadImgUrl;

    @Column(name = "s_unionid")
    private String sUnionId;

    @Column(name = "s_create_time")
    private Timestamp sCreateTime;

    @Column(name = "order_company_union_id")
    private String orderCompanyUnionId;

    public String getOrderCompanyUnionId() {
        return orderCompanyUnionId;
    }

    public void setOrderCompanyUnionId(String orderCompanyUnionId) {
        this.orderCompanyUnionId = orderCompanyUnionId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsOpenId() {
        return sOpenId;
    }

    public void setsOpenId(String sOpenId) {
        this.sOpenId = sOpenId;
    }

    public String getsNickName() {
        return sNickName;
    }

    public void setsNickName(String sNickName) {
        this.sNickName = sNickName;
    }

    public Integer getsGender() {
        return sGender;
    }

    public void setsGender(Integer sGender) {
        this.sGender = sGender;
    }

    public String getsProvince() {
        return sProvince;
    }

    public void setsProvince(String sProvince) {
        this.sProvince = sProvince;
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }

    public String getsCountry() {
        return sCountry;
    }

    public void setsCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public String getsHeadImgUrl() {
        return sHeadImgUrl;
    }

    public void setsHeadImgUrl(String sHeadImgUrl) {
        this.sHeadImgUrl = sHeadImgUrl;
    }

    public String getsUnionId() {
        return sUnionId;
    }

    public void setsUnionId(String sUnionId) {
        this.sUnionId = sUnionId;
    }

    public Timestamp getsCreateTime() {
        return sCreateTime;
    }

    public void setsCreateTime(Timestamp sCreateTime) {
        this.sCreateTime = sCreateTime;
    }
}
