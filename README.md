# demo-spring-boot-liquibase

- Update changelog: `mvn liquibase:update`


- Generate changelog from database:  
  `mvn liquibase:generateChangeLog -Dliquibase.outputChangeLogFile=src/main/resources/liquibase/changelog/generated.sql`

    - For powershell, use:
      `-D"liquibase.outputChangeLogFile=src/main/resources/liquibase/changelog/generated.sql"`


- Rollback: `mvn liquibase:rollback -D"liquibase.rollbackCount=1"`
    - `"-Dliquibase.rollbackDate=Jun 03, 2017"`
    - `-Dliquibase.rollbackTag=1.0`