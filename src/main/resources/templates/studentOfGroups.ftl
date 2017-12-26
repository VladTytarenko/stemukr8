<#assign title = "Students Of Groups">
<#assign path_prefix = "../../">

<#include "common/header.ftl">
<div class="container">
        <#list student_list as user>
            <tr>
                <td>${user.id}</td>
            </tr>
            <tr>
                <td>${user.username}</td>
            </tr>
            <tr>
                <td>${user.email}</td>
            </tr>
            <tr>
                <td><a href="/view/gradebook/${user.id}">View gradebook</a></td>
            </tr>
        </#list>
</div>

<#include "common/footer.ftl">