
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<link rel="stylesheet" type="text/css" href="content.css">
<title>Fei Wang</title> 
</head>
<body>

<table style="width:100%">
<tr>
<td colspan="2" style="background-color:#FFA500;">
<h1 style = "text-align:center">Infrastructure Management</h1>
</td>
</tr>

<tr>
<td class="list">
<b>My Building</b><br>
<a href="index.php">Building IoT</a><br>
<a href="index.php">Status Report</a><br>
<a href="index.php">Map View</a><br>
</td>
<td class="content">
<br><br><br><br><br><br>

<form action="#" method="post">
sensor type: <input type="text" name="type"><br>
sensor status: <input type="text" name="status"><br>
<input type="submit" value="提交">
</form>

<?php 

include 'config.php';

if(isset($_POST["type"])&&$_POST["status"])
{
    $type=$_POST["type"];
    $status=$_POST["status"];
    
    $sql = "INSERT INTO sensor (sensor_type, sensor_status) VALUES ($type, $status)";
    
    if (mysqli_query($conn, $sql)) {
        echo "insert success";
    } else {
        echo "Error: " . $sql . "<br>" . mysqli_error($conn);
    }
} 



?>


</td>
</tr>

<tr>
<td class="bottle" colspan="2" >
feiwang.tech</td>
</tr>

</table>

</body>
</html>

