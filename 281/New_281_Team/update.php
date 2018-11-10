
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

<?php 
    include 'config.php';
    
    $id = (int) $_GET['id'];
    $sql = "select sensor_type, sensor_status from sensor where sensor_id = $id";
    $result = mysqli_query($conn, $sql);
    $row = mysqli_fetch_assoc($result);
    
    $type = $row['sensor_type'];
    $status = $row['sensor_status'];
    
    if(isset($_POST["type"])&&$_POST["status"])
    {
        $type2 = $_POST["type"];
        $status2 = $_POST["status"];
        
        echo '<form action="#" method="post">
               sensor type: <input type="text" name="type" value = "'.$type2.'"><br>
               sensor status: <input type="text" name="status" value = "'.$status2.'"><br>
               <input type="submit" value="提交">
                </form>';
        
        if(strcmp($type, $type2) == 0 && strcmp($status, $status2)==0)
        {
            echo "please enter different data";
        }
        else {
            
            $sql = "update sensor set sensor_type = $type2, sensor_status = $status2 where sensor_id = $id";
            
            if (mysqli_query($conn, $sql)) {
                echo "insert success";
            } else {
                echo "Error: " . $sql . "<br>" . mysqli_error($conn);
            }
        }
    }else{
    
     echo '<form action="#" method="post">
               sensor type: <input type="text" name="type" value = "'.$type.'"><br>
               sensor status: <input type="text" name="status" value = "'.$status.'"><br>
               <input type="submit" value="提交">
                </form>';
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

