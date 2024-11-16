package com.skillswap.platform.tutormatch.Tutorings.Domain.Services;

import com.skillswap.platform.tutormatch.Tutorings.Domain.Model.Entities.Course;
import com.skillswap.platform.tutormatch.Tutorings.Domain.Model.Queries.GetAllCoursesQuery;

import java.util.List;

public interface CourseQueryService {

    List<Course> handle(GetAllCoursesQuery query);
}
