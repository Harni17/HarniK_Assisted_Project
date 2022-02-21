package com.HarniK_Feedback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HarniK_Feedback.entities.Feedback;
import com.HarniK_Feedback.repositories.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepo;
	
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepo.findAll();
	}
	
	public Feedback addNewFeedback(Feedback fb) {
		return feedbackRepo.save(fb);
	}
}
