package com.chandi.spring.data.cassandra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandi.spring.data.cassandra.model.Tutorial;
import com.chandi.spring.data.cassandra.repository.TutorialRepository;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	TutorialRepository tutorialRepository;

	@Override
	public List<Tutorial> findByPublished(boolean published) {

		return tutorialRepository.findByPublished(published);
	}

	@Override
	public List<Tutorial> findByTitleContaining(String title) {

		return tutorialRepository.findByTitleContaining(title);
	}

}
