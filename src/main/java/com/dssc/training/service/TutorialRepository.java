package com.dssc.training.service;


import com.dssc.training.dto.Tutorial;

import java.util.List;

public interface TutorialRepository {
  int save(Tutorial book); // C
  Tutorial findById(Long id);// R
  int update(Tutorial book);// U
  int deleteById(Long id);// D

  List<Tutorial> findAll();

  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);

  int deleteAll();
}
