package com.skillswap.platform.tutormatch.Tutorings.Application.Internal.queryservices;

import com.skillswap.platform.tutormatch.Tutorings.Domain.Model.Aggregate.TutoringSession;
import com.skillswap.platform.tutormatch.Tutorings.Domain.Model.Entities.Course;
import com.skillswap.platform.tutormatch.Tutorings.Domain.Model.Queries.*;
import com.skillswap.platform.tutormatch.Tutorings.Domain.Services.CourseQueryService;
import com.skillswap.platform.tutormatch.Tutorings.Domain.Services.TutoringSessionQueryService;
import com.skillswap.platform.tutormatch.Tutorings.Infrastructure.persistence.jpa.repositories.CourseRepository;
import com.skillswap.platform.tutormatch.Tutorings.Infrastructure.persistence.jpa.repositories.TutoringSessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for querying courses.
 * <p>
 * Provides methods to retrieve courses based on various criteria,
 * such as all courses.
 */
@Service
public class CourseQueryServiceImpl implements CourseQueryService {

    private final CourseRepository courseRepository;

    public CourseQueryServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;

    }

    /**
     * Retrieves all available courses
     * @param query The query object (unused in this implementation).
     * @return A list of all courses.
     *
     **/
    @Override
    public List<Course> handle(GetAllCoursesQuery query){
        return courseRepository.findAll();
    }


}
