<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Cabinet</title>
</head>
<body>
    <h1>Welcome ${student.username}</h1>
    <h1>Email ${student.email}</h1>
    <h1>Id ${student.id}</h1>
    <a href="/view/gradebook/${student.id}">Gradebook</a>
</body>
</html>