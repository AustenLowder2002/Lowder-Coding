<?php
    if (isset($_POST['submit'])) {
       
        $hours_parked = floatval($_POST['hours']);

        $max_daily_charge = 18.00;

        $base_charge = 5.00;

        $additional_charge_per_hour = 1.50;

        // Calculate the parking charges
        if ($hours_parked <= 3) {
            $parking_charge = $base_charge;
        } else {
            
            $additional_hours = ceil($hours_parked - 3);

            $additional_charge = $additional_hours * $additional_charge_per_hour;

            $parking_charge = $base_charge + $additional_charge;

            $parking_charge = min($parking_charge, $max_daily_charge);
        }

        // Display the result
        echo "<h2>Parking Charges: $" . number_format($parking_charge, 2) . "</h2>";
    }
    ?>
