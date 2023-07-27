<?php
    // Retrieve data from the form
    $name = $_POST['name'];
    $quiz_score = $_POST['quiz_score'];
    $assignment_score = $_POST['assignment_score'];
    $midterm_score = $_POST['midterm_score'];
    $final_exam_score = $_POST['final_exam_score'];

    $average_score = ($quiz_score * 0.15) + ($assignment_score * 0.40) + ($midterm_score * 0.20) + ($final_exam_score * 0.25);

    function calculateLetterGrade($average_score) {
        if ($average_score >= 90) {
            return 'A';
        } elseif ($average_score >= 80) {
            return 'B';
        } elseif ($average_score >= 70) {
            return 'C';
        } elseif ($average_score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    $letter_grade = calculateLetterGrade($average_score);
	
    // Display the results
    echo "<p><strong>Student Name:</strong> " . htmlspecialchars($name) . "</p>";
    echo "<p><strong>Average Score:</strong> " . number_format($average_score, 2) . "</p>";
    echo "<p><strong>Letter Grade:</strong> " . $letter_grade . "</p>";
    ?>

