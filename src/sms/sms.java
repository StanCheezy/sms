/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

/**
 *
 * @author Stan
 */
class sms {
    //private int phone_number;
    private String phone_number,fname,lname,dob,gender,email,country,city;
    public sms(String phone_number,String fname,String lname,String dob,String gender,String email,String country,String city)
    {
        this.phone_number=phone_number;
        this.fname=fname;
        this.lname=lname;
        this.gender=gender;
        this.dob=dob;
        this.email=email;
        this.country=country;
        this.city=city;
    }

    
    public String getPhone_Number(){
        return phone_number;
    }
    public String getfname(){
        return fname;
    }
    public String getlname(){
        return lname;
    }
    public String getGender(){
        return gender;
    }
    public String getDoB(){
        return dob;
    }
    public String getEmail(){
        return email;
    }
    public String getCountry(){
        return country;
    }
    public String getCity(){
        return city;
    }
}
