package com.ap.mango.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class AudioFiles implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
     * Construct a new instance.
     */
    public AudioFiles() {
       
    }

    
    public AudioFiles(final int audioFile_Id, final int user_Id, final String filePath) {
    	 this.audioFile_Id = audioFile_Id;
        this.user_Id = user_Id;
        this.filePath = filePath;
        
    }

	@Id
	@Column(name = "audioFile_Id")
	private int audioFile_Id;

	@Column(name = "user_Audio_Id")
	private int user_Id;

	@Column(name = "filePath")
	private String filePath;

	
	

	
	
	
}
