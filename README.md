TASK 1
======
Create schema for the following requirements.

We want to have following entities:
* project
  * name
  * creation time
* user
  * login
  * password
* task
  * title
  * creation time
  * assignee
  * status
    * open
    * in-progress
    * qa
    * done
  * sub tasks*
    
Assumptions:
* a user can be assigned to multiple projects
* a project can have multiple users assigned
* a task can have an assignee
* every task is assigned to a project
* every task can consist of multiple sub tasks*

TASK 2
======
Create spock parametrized tests for adding some users

TASK 3
======
1. Create new project with gradle
2. Create some sql schema
3. Execute schema on db
4. Generate schema classes with jooq
5. Create DI configuration for DSLContext
6. Use the DI configuration to create spock test and test simple jooq usage