<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>Edit User</h1>
    <form name="teacher" action="/admin/edit-teachers/${teacherId}" method="post">
        <p>Id: ${teacherId} </p>
        <p>Name: </p>
        <input title="Name" type="text" name="username" value="${teacher.username}"/>
        <p>Email:</p>
        <input title="Email" type="email" name="email" value="${teacher.email}"/>
        <p>Password:</p>
        <input title="Password" type="password" name="password"/>
        <input type="submit" value="OK">
    </form>
</body>
</html>