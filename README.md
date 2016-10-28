# g05_ssm_template
1. 修改pom.xml中artifactId、tomcat虚拟目录
2. 修改web.xml中<display-name>、<servlet-name>
3. jdbc.properties中数据库用户信息
4. 如果不需要httpclent，删除com.git.evictor、applicationContext-httpclient.xml、com.git.domain.HttpResult、com.git.service.impl.ApiService即可
5. 配置了一个默认的拦截器，没做任何处理，允许通过了com.git.intercepor.DemoInteceptor，springmvc.xml
6. c3p0连接池
7. 添加listener，用于监测服务器启动和关闭，web.xml\com.git.listener.ContextListener