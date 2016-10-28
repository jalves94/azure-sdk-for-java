## Functional Requirements [[1]](https://azure.microsoft.com/pt-pt/blog/getting-started-with-the-azure-java-management-libraries/):

* Create, delete, and update settings for resources like web sites, SQL databases, cloud services, scheduler job collections, virtual machines, and storage
* Start and stop web sites
* Back up databases to storage accounts
* Automate the creation of virtual machines

## Non-Functional Requirements:

* Require Authentication: “careless or malicious access to these APIs has the potential to break your applications and cost you money, so obviously these API calls need to be authenticated.” [[2]](https://blogs.msdn.microsoft.com/tomholl/2014/11/24/unattended-authentication-to-azure-management-apis-with-azure-active-directory/)
* Provide different conditions to different types of Azure accounts: each account is usually associated with several features that are limited according to the price that was paid per month. For example, for the SQL Database the maximum storage capability is 250 GB per pool, which corresponds to the premium account; for the Machine Learning service, it can include up to 50000000 API transactions and 12500 API compute hours; and for the Virtual Machine service, there are several types that can be chosen (Linux, Windows, Ubuntu) [[3]](https://azure.microsoft.com/en-gb/pricing/calculator/).

## Domain Model
The project chosen by the group is really large, so the domain model was made in a general way. So the azure SDK for java provides the tools to use Azure with software developed with JAVA. That way it will allow to manage some resources of the Azure platform that will be used in the software, like virtual machines, sql databases or a storage account. Depending of the kind of resource that it�s going to be used, it can be, if wanted by the developer, associated in resources group that will be managed all together. It allows a easily and simple way of managing, for instance control and monitor, the resources used in a specific part of the software. The resources of Azure can interact in the same project with some resource groups or with other resources. So this API provides all the resource management tools, for resource and resource groups, that a user when developing in JAVA [[5]](https://azure.microsoft.com/en-us/documentation/articles/resource-group-overview/).

The resources will be provided by a resource provider that will depend on the subscriptions that the developer has payed and has associated with his account.

![Domain model](images/domainmodel.jpg)

