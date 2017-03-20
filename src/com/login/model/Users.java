package com.login.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "users")
@Getter
@Builder
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
     * Construct a new instance.
     */
    public Users() {
       
    }

    
    public Users(final String userId, final String firstName, final String lastName, final String emailId,  final String password,final String username) {
    	 this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.password = password;
        this.userId = userId;
    }

	@Id
	@Column(name = "user_id")
	private String userId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "password")
	private String password;

	@Column(name = "user_name")
	private String username;
}
