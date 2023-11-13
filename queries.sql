--Part 1
SELECT *
FROM JOB;
--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
--SELECT skill
--FROM job;
--SELECT * FROM skill
--LEFT INNER JOIN job_skills ON skill.id = job_skills.skills_id, job_skills.skills_id = skill.id
--WHERE job_skills.jobs_id IS NOT NULL
--ORDER BY name ASC;

SELECT * FROM skill
LEFT INNER JOIN job_skills ON (skill.id = job_skills.skills_id)
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;