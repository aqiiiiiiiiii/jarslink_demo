动态部署jar包

telnet localhost 1234

check -b

install -b file:///Users/wangchen/Documents/jarslink_demo/plugins/1_jarslink_provider-0.0.1-SNAPSHOT-ark-biz.jar

uninstall -b -n jarslink_provider -v 0.0.1-SNAPSHOT

http://localhost:8080/hello.do

http://localhost:8080/actuator/readiness
