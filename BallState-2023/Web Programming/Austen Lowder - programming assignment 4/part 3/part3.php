<?php
    // Function to calculate the total cost
    function calculateTotalCost($carType, $numDays, $insurance) {
        $carRates = array(
            'compact' => 30,
            'intermediate' => 40,
            'standard' => 50
        );

        $insuranceRate = 15;

        if (!array_key_exists($carType, $carRates)) {
            echo "Invalid car type selected.";
            return;
        }

        $baseCost = $carRates[$carType] * $numDays;

        $insuranceCost = $insurance === 'yes' ? $insuranceRate * $numDays : 0;

        $totalCost = $baseCost + $insuranceCost;

        echo "Car Type: " . ucfirst($carType) . "<br>";
        echo "Number of Days: " . $numDays . "<br>";
        echo "Insurance: " . ucfirst($insurance) . "<br>";
        echo "Base Cost: $" . $baseCost . "<br>";
        echo "Insurance Cost: $" . $insuranceCost . "<br>";
        echo "Total Cost: $" . $totalCost . "<br>";
    }

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $carType = $_POST["carType"];
        $numDays = $_POST["numDays"];
        $insurance = $_POST["insurance"];

        if (!is_numeric($numDays) || $numDays < 1) {
            echo "Invalid number of days.";
        } else {
            // Call the function to calculate and display the total cost
            calculateTotalCost($carType, $numDays, $insurance);
        }
    }
    ?>
