package com.ap.mango.dao.soundrecorder;

import java.util.List;

import com.ap.mango.entity.AudioFiles;

public interface AudioFilesDao {

	  public List<AudioFiles> getAllAudioFiles();

	  public void addNewAudioFile( AudioFiles audioFiles );
	  
	  public AudioFiles getAudioFile( int audioFile_Id );

//	  public void updateAudioFile( AudioFiles audioFiles );

	//  public void deleteAudioFile( int audioFile_Id );

	
	
	
	
}
