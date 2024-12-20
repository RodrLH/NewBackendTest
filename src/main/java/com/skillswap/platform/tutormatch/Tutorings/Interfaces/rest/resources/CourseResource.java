package com.skillswap.platform.tutormatch.Tutorings.Interfaces.rest.resources;

import com.skillswap.platform.tutormatch.Tutorings.Domain.Model.Entities.DailySchedule;
import com.skillswap.platform.tutormatch.Tutorings.Domain.Model.Entities.Semester;

import java.util.List;

/**
 * Represents the resource for a course.
 *
 * @param id          the unique identifier of the course
 * @param name        the title of the course
 * @param description a brief description of the course
 * @param cycle       the cycle of the course
 */
public record CourseResource(
        Long id,
        String name,
        String description,
        Integer cycle
) {}
