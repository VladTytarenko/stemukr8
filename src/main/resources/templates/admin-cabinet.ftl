<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
   <h1>Welcome ${admin.username}</h1>
   <br>
   <a href="/admin/edit-teachers">View teachers' information</a>
   <br>
   <a href="/admin/students">View students' information</a>
   <br>
   <a href="/admin/admins">View admins' information</a>
   <br>
   <a href="/admin/new_user">Add new user</a>
   <br>
   <a href="/admin/edit-teachers/${admin.id}">Edit your own information</a>
</body>
</html>