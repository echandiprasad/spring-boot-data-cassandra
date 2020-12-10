package com.chandi.spring.data.cassandra.service;

import java.util.List;

import com.chandi.spring.data.cassandra.model.Tutorial;


public interface TutorialService {

	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);
}
