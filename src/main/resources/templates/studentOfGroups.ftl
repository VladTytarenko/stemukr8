<#assign title = "Students Of Groups">
<#assign path_prefix = "../../">

<#include "common/header.ftl">
<div class="container">
        <#list student_list as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.email}</td>
            </tr>
        </#list>
</div>

<#include "common/footer.ftl">