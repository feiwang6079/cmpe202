<?php

include 'config.php';

$count_sql = 'select count(sensor_id) as c from sensor';
$result = mysqli_query($conn, $count_sql);
$data = mysqli_fetch_assoc($result);

//得到总的用户数
$count = $data['c'];
echo $count.'<br>';
$page = isset($_GET['page']) ? (int) $_GET['page'] : 1;
$num = 1;
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
while ($row = mysqli_fetch_assoc($result)) {
    
    echo '<tr>';
    echo '<td>' . $row['sensor_id'] . '</td>';
    echo '<td>' . $row['sensor_type'] . '</td>';
    echo '<td>' . $row['time'] . '</td>';
    echo '<td><a href="edit.php?id=' . $row['sensor_id'] . '">编辑传感器</a></td>';
    echo '<td><a href="delete.php?id=' . $row['sensor_id'] . '">删除传感器</a></td>';
    echo '</tr>';
}
echo '<tr><td colspan="5"><a href="database.php?page=1">首页</a>  <a href="database.php?page=' . ($page - 1) . '">上一页</a>   <a href="database.php?page=' . ($page + 1) . '">下一页</a>  <a href="database.php?page=' . $total . '">尾页</a>  当前是第 ' . $page . '页  共' . $total . '页 </td></tr>';

echo '</table>';


// //查询语句
// $sql = "SELECT sensor_id, sensor_type, time FROM sensor";
// $result = $conn->query($sql);

// echo '<table width="800" border="1">';

// while ($row = $result->fetch_assoc()) {
    
//     echo '<tr>';
//     echo '<td>' . $row['sensor_id'] . '</td>';
//     echo '<td>' . $row['sensor_type'] . '</td>';
//     echo '<td>' . $row['time'] . '</td>';
//     echo '<td><a href="edit.php?id=' . $row['sensor_id'] . '">编辑传感器</a></td>';
//     echo '<td><a href="delete.php?id=' . $row['sensor_id'] . '">删除传感器</a></td>';
//     echo '</tr>';
// }

// echo '</table>';

// if ($result->num_rows > 0) {
//     // 输出数据
//     while($row = $result->fetch_assoc()) {
//         echo "id: " . $row["sensor_id"]. " <br>sensor_type: " . $row["sensor_type"]. "<br>time: " . $row["time"]. "<br>";
//     }
// } else {
//     echo "0 结果";
// }

//增加语句

// $sql = "INSERT INTO sensor (sensor_id, sensor_type)
// VALUES (2, 301)";

// if ($conn->query($sql) === TRUE) {
//     echo "新记录插入成功";
// } else {
//     echo "Error: " . $sql . "<br>" . $conn->error;
// }

//增加操作
