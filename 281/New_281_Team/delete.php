<?php
include 'config.php';

$id = (int) $_GET['id'];
$sql = "DELETE FROM sensor where sensor_id = $id";
if (mysqli_query($conn, $sql))
{
    header("Location: index.php");
        
}
else {
    echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}
?>