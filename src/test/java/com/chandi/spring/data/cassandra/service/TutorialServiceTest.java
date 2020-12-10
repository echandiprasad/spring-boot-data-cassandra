package com.chandi.spring.data.cassandra.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.chandi.spring.data.cassandra.model.Tutorial;
import com.chandi.spring.data.cassandra.repository.TutorialRepository;

public class TutorialServiceTest {

	TutorialService tutorialService;
	TutorialRepository tutorialRepository;

	@Test
	public void it_should_be_return_name() {
		List<Tutorial> list = new ArrayList<>();
		Tutorial tutorial = new Tutorial();
		UUID uid = UUID.fromString("c81d4e2e-bcf2-11e6-869b-7df92533d2db");
		tutorial.setId(uid);
		tutorial.setTitle("DemoOe");
		tutorial.setDescription("No");
		tutorial.isPublished();

		list.add(tutorial);

		tutorialRepository = mock(TutorialRepository.class);
		tutorialService = new TutorialServiceImpl();
		ReflectionTestUtils.setField(tutorialService, "tutorialRepository", tutorialRepository);
		when(tutorialService.findByPublished(true)).thenReturn(list);

		assertEquals(list.get(0), tutorialService.findByPublished(true).get(0));
		// verify(mb, times(1)).getMessage("RK");

	}

}
