# Assignment 1
## Development Process
The development process used by Microsoft is an agile process. An agile process is an iterative and incremental model that it is characterized to work into small increments that minimize the amount of up-front planning and design. The idea is to have an available release with the minimum bugs at the end of each iteration. Advantages of this iterative approach to software development include [[1]](http://www.allaboutagile.com/agile-principle-5-how-do-you-eat-an-elephant/):

* _Reduced risk_: clear visibility of what’s completed to date throughout a project
* _Increased value_: delivering some benefits early; being able to release the product whenever it’s deemed good enough, rather than having to wait for all intended features to be ready
* _More flexibility/agility_: can choose to change direction or adapt the next iterations based on actually seeing and using the software
* _Better cost management_: if, like all-too-many software development projects, you run over budget, some value can still be realised; you don’t have to scrap the whole thing if you run short of funds

The goal of Microsoft is to build software more incrementally in order to deliver it faster to consumers. That way, they can use the product and give their feedback and Microsoft can learn from it in order to make the product better.

Since this project includes several cloud services, an agile process is the ideal option: a version with some services can be released and then over time it will get updates with more services, adapting the product to the needs of the client. 

In this project, developing the software using a waterfall model would be a failure for several reasons:

* Spending one year coding and one year testing all the services that the company is able to offer might lead to some services being unuseful for the client after two years (or being already delivered by other company);
* The company wouldn't be able to change and adapt itself to its clients and, consequently, wouldn’t be capable of delivering something new. A successful company is one that knows how to translate an idea into reality and can deliver the product to the clients quickly.

The project is quite big and complex and there are some bugs in a few services that can be fixed. There are several branches in GitHub that contain code for the preparation of next releases and iterations and also code to fix some bugs.[[6]] (http://mentormate.com/blog/windows-azure-development-lifecycle/)

## Code and build conventions

The project follows the code standard presented in [[7]] (http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html). 

This project is developed using Maven which is a tool that can be used to build and manage any Java-based project. The objective of this tool is to allow a developer to understand the state of a development project as quickly as possible. 
To attain this goal, Maven makes the process easier, provides an uniform build system, quality information on the project and guidelines for the best development practices [[8]] (https://maven.apache.org/what-is-maven.html).

As all project features must be done with this tool, anyone who wants to contribute to this project and is familiar with Maven can understand how the rest of the project was built [[8]] (https://maven.apache.org/what-is-maven.html). By only reading the POM file (a file that contains information about the project and configuration details used by Maven to build it) the developer can know the project dependencies, the plugins or goals that can be executed and the build profiles [[9]] (https://maven.apache.org/guides/introduction/introduction-to-the-pom.html).

## Alternative method suggestion

An alternative model that could be use in Azure Software Development is the RAD model. Rapid Application Development model is an incremental software process model that focuses on short development cycle time. This model is a high-speed model which adapts many steps from waterfall model in which rapid development is achieved by using component based construction approach.

This would be a perfect fit for Azure since the basic requirements for implementing this model are probably answered in Azure:

* Sufficient human resources to create the right number of RAD teams
* Developers and customers must be committed to the rapid, rapid-fire activities necessary to complete the system in a much abbreviated time frame.
* Project should be properly modularize.

Besides this model brings a lot of advantages that are very useful along the development of Azure:
* Flexible and adaptable to changes.
* Prototyping applications gives users a tangible description from which to judge whether critical system requirements are being met by the system. Report output can be compared with existing reports. Data entry forms can be reviewed for completeness of all fields, navigation, data access (drop down lists, checkboxes, radio buttons, etc.).
* RAD generally incorporates short development cycles: users see the RAD product quickly.
* RAD involves user participation thereby increasing chances of early user community acceptance.
* RAD realizes an overall reduction in project risk.
