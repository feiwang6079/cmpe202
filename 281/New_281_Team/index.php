
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
<br><br>

<table>
<tr>
<td>
Building Address: 979 Melbourne Blvd <br>
</td>
</tr>

<tr>
<td>
<form action="add.php" method="post">Smart Light
<input type="submit" value="Add">
</form>
</td>
</tr>

<tr>
<td>
<?php 
include 'config.php';

$count_sql = 'select count(sensor_id) as c from sensor';
$result = mysqli_query($conn, $count_sql);
$data = mysqli_fetch_assoc($result);
$count = $data['c'];

//得到总的用户数
$count = $data['c'];
$page = isset($_GET['page']) ? (int) $_GET['page'] : 1;
$num = 5;
$total = ceil($count / $num);
if ($page <= 1) {
    $page = 1;
}
if ($page >= $total) {
    $page = $total;
}

$offset = ($page - 1) * $num;
$sql = "select sensor_id, sensor_type, time from sensor order by sensor_id desc limit $offset , $num";
$result = mysqli_query($conn, $sql);
echo '<table width="800" border="1">';

echo '<tr>';
echo '<td>' . 'Device id' . '</td>';
echo '<td>' . 'Device type' . '</td>';
echo '<td>' . 'location' . '</td>';
echo '<td>' . 'Install time' . '</td>';
echo '<td>' . 'update' . '</td>';
echo '<td>' . 'delete' . '</td>';
echo '</tr>';

while ($row = mysqli_fetch_assoc($result)) {
    
    echo '<tr>';
    echo '<td>' . $row['sensor_id'] . '</td>';
    echo '<td>' . $row['sensor_type'] . '</td>';
    echo '<td>' . $row['time'] . '</td>';
    echo '<td>' . $row['time'] . '</td>';
    echo '<td><a href="update.php?id=' . $row['sensor_id'] . '">update</a></td>';
    echo '<td><a href="delete.php?id=' . $row['sensor_id'] . '">delete</a></td>';
    echo '</tr>';
}
echo '<tr><td colspan="6"><a href="index.php?page=1">Main</a>  <a href="index.php?page=' . ($page - 1) . '">Previous</a>   <a href="index.php?page=' . ($page + 1) . '">Next</a>  <a href="index.php?page=' . $total . '">Last</a>  Current ' . $page . 'Total' . $total . ' </td></tr>';
echo '</table>'

?>
</td>
</tr>
</table>


<tr>
<td class="bottle" colspan="2" >
feiwang.tech</td>
</tr>

</table>

</body>
</html>

