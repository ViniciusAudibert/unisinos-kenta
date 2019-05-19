package com.br.kenta.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "record")
public class Ticket {

	@Id
	@GeneratedValue
	private Long id;

	@Temporal(TemporalType.DATE)
	protected Date openDate;

	@ManyToOne
	protected User openedBy;gram Files\Java\jdk1.8.0_144\bin\java" -Dmaven.multiModuleProjectDirectory=C:\projects\unisinos-kenta "-Dmaven.home=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.2\plugins\maven\lib\maven3" "-Dclassworlds.conf=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.2\plugins\maven\lib\maven3\bin\m2.conf" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.2\lib\idea_rt.jar=50168:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.2\plugins\maven\lib\maven3\boot\plexus-classworlds-2.5.2.jar" org.codehaus.classworlds.Launcher -Didea.version=2017.2.2 spring-boot:run
			[INFO] Scanning for projects...
			[INFO]
			[INFO] ------------------------------------------------------------------------
			[INFO] Building kenta 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
			[INFO]
			[INFO] >>> spring-boot-maven-plugin:2.1.4.RELEASE:run (default-cli) > test-compile @ kenta >>>
			[INFO]
			[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ kenta ---
			[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO]
			[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ kenta ---
			[INFO] Changes detected - recompiling the module!
			[INFO] Compiling 7 source files to C:\projects\unisinos-kenta\target\classes
[INFO]
			[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ kenta ---
			[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\projects\unisinos-kenta\src\test\resources
[INFO]
			[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ kenta ---
			[INFO] Changes detected - recompiling the module!
			[INFO] Compiling 1 source file to C:\projects\unisinos-kenta\target\test-classes
[INFO]
			[INFO] <<< spring-boot-maven-plugin:2.1.4.RELEASE:run (default-cli) < test-compile @ kenta <<<
[INFO]
			[INFO] --- spring-boot-maven-plugin:2.1.4.RELEASE:run (default-cli) @ kenta ---

			.   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
			( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
			\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
			'  |____| .__|_| |_|_| |_\__, | / / / /
			=========|_|==============|___/=/_/_/_/
			:: Spring Boot ::        (v2.1.4.RELEASE)

			2019-05-19 18:47:43.193  INFO 10756 --- [           main] com.br.kenta.KentaApplication            : Starting KentaApplication on DESKTOP-2998LS2 with PID 10756 (C:\projects\unisinos-kenta\target\classes started by Vinicius in C:\projects\unisinos-kenta)
			2019-05-19 18:47:43.195  INFO 10756 --- [           main] com.br.kenta.KentaApplication            : No active profile set, falling back to default profiles: default
2019-05-19 18:47:44.239  INFO 10756 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2019-05-19 18:47:44.325  INFO 10756 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 74ms. Found 1 repository interfaces.
			2019-05-19 18:47:44.823  INFO 10756 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$ae7e9a53] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-05-19 18:47:45.509  INFO 10756 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 3001 (http)
			2019-05-19 18:47:45.554  INFO 10756 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
			2019-05-19 18:47:45.554  INFO 10756 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.17]
			2019-05-19 18:47:45.688  INFO 10756 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-05-19 18:47:45.688  INFO 10756 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2435 ms
2019-05-19 18:47:45.962  INFO 10756 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
			2019-05-19 18:47:46.286  INFO 10756 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
			2019-05-19 18:47:46.399  INFO 10756 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
	name: default
	...]
			2019-05-19 18:47:46.836  INFO 10756 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.9.Final}
2019-05-19 18:47:46.837  INFO 10756 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2019-05-19 18:47:47.112  INFO 10756 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
2019-05-19 18:47:47.382  INFO 10756 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2019-05-19 18:47:48.499  INFO 10756 --- [           main] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@71dc5321'
			2019-05-19 18:47:48.503  INFO 10756 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
			2019-05-19 18:47:49.349  INFO 10756 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
			2019-05-19 18:47:49.456  WARN 10756 --- [           main] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2019-05-19 18:47:49.816  INFO 10756 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 3001 (http) with context path ''
			2019-05-19 18:47:49.847  INFO 10756 --- [           main] com.br.kenta.KentaApplication            : Started KentaApplication in 7.235 seconds (JVM running for 16.542)
2019-05-19 18:47:49.944  INFO 10756 --- [           main] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
	Group(id=1, name=Denver JUG, address=null, city=null, stateOrProvince=null, country=null, postalCode=null, user=null, events=[Event(id=5, date=2018-12-12T18:00:00Z, title=Full Stack Reactive, description=Reactive with Spring Boot + React, attendees=[])])
	Group(id=2, name=Utah JUG, address=null, city=null, stateOrProvince=null, country=null, postalCode=null, user=null, events=[])
	Group(id=3, name=Seattle JUG, address=null, city=null, stateOrProvince=null, country=null, postalCode=null, user=null, events=[])
	Group(id=4, name=Richmond JUG, address=null, city=null, stateOrProvince=null, country=null, postalCode=null, user=null, events=[])
2019-05-19 18:48:07.837  INFO 10756 --- [nio-3001-exec-9] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
			2019-05-19 18:48:07.838  INFO 10756 --- [nio-3001-exec-9] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
			2019-05-19 18:48:07.881  INFO 10756 --- [nio-3001-exec-9] o.s.web.servlet.DispatcherServlet

	private Category category;
}