package com.ap.mango.web.module;

import com.ap.mango.dao.soundrecorder.AudioFilesDao;
import com.ap.mango.dao.soundrecorder.AudioFilesDaoImpl;
import com.ap.mango.web.controller.ActivityServlet;
import com.ap.mango.web.controller.LoginServlet;
import com.ap.mango.web.controller.RegisterServlet;
import com.ap.mango.web.controller.SoundRecorderServlet;
import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

public class MangoDependencyModule extends ServletModule {

	@Override
	protected void configureServlets() {
		/**
		 *  URL mapping patterns
		 */
		super.configureServlets();
		serve("/l").with(LoginServlet.class);
		serve("/r").with(RegisterServlet.class);
		serve("/upload").with(SoundRecorderServlet.class);
		serve("/a").with(ActivityServlet.class);
		
		/**
		 *  binding of objects require while injecting
		 */
		bind(AudioFilesDao.class).to(AudioFilesDaoImpl.class).in(Singleton.class);
	}
}
