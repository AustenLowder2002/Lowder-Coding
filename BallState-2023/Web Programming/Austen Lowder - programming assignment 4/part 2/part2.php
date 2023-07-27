<?php
    if (isset($_POST['submit'])) {
        // Get user inputs
        $car_price = floatval($_POST['car_price']);
        $down_payment = floatval($_POST['down_payment']);
        $annual_interest_rate = floatval($_POST['annual_interest_rate']);
        $loan_term = intval($_POST['loan_term']);

        // Calculate monthly payment
        $i = $annual_interest_rate / 1200;
        $n = $loan_term * 12;
        $numerator = ($car_price - $down_payment) * $i * pow(1 + $i, $n);
        $denominator = pow(1 + $i, $n) - 1;
        $monthly_payment = $numerator / $denominator;

        // Display the result
        echo "<h1>Monthly Payment: $" . number_format($monthly_payment, 2) . "</h1>";
    }
    ?>
