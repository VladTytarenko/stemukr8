<#assign title = "Tasks">
<#assign path_prefix = "../../">

<#include "common/header.ftl">
<div class="container">
        <#list listTasks as task>
            <tr>
                <td>${task.id}</td>
                <td>${row.taskTitle}</td>
                <td>${row.task}</td>
            </tr>
        </#list>
</div>

<#include "common/footer.ftl">