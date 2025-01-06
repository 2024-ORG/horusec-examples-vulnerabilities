$username = $_GET['username'];
$password = $_GET['password'];

$sql = "SELECT * FROM users WHERE username='$username' AND password='$password'";
$result = mysqli_query($conn, $sql); 
